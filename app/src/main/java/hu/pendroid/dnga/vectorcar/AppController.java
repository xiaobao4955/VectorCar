package hu.pendroid.dnga.vectorcar;

import android.util.Log;

import com.adrianrobotka.brick.Controller;
import com.adrianrobotka.brick.util.ProcessIndicator;

import hu.pendroid.dnga.vectorcar.model.Car;
import hu.pendroid.dnga.vectorcar.model.Ground;
import hu.pendroid.dnga.vectorcar.view.GroundDrawer;

final class AppController extends Controller {
    private static final String LOGTAG = AppController.class.getSimpleName();
    private static AppController instance = null;

    private Ground ground;
    private Car car;

    private AppController() {
    }

    static AppController getInstance() {
        if (instance != null)
            return instance;
        else
            return instance = new AppController();
    }

    @Override
    public void init(ProcessIndicator indicator) throws IllegalStateException {
        super.init(indicator);
        Log.d(LOGTAG, "AppController.init()");
    }

    protected void createModels() {
        ground = new Ground();
    }

    protected void createDrawers() {
        GroundDrawer groundDrawer = new GroundDrawer(ground);

    }

    protected void createModifiers() {

    }
}
