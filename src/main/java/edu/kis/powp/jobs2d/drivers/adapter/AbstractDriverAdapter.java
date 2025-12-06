package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.Job2dDriver;

public class AbstractDriverAdapter extends AbstractDriver {
    Job2dDriver driver;

    public AbstractDriverAdapter(Job2dDriver driver, int x, int y) {
        super(x, y);

        this.driver = driver;
    }

    @Override
    public void operateTo(int x, int y) {
        this.driver.operateTo(x, y);
    }
    
}
