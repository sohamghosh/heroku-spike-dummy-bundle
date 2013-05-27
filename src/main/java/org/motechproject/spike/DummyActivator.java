package org.motechproject.spike;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import java.util.Date;

public class DummyActivator implements BundleActivator {

    @Override
    public void start(BundleContext context) throws Exception {
        System.out.println("[INFO] Starting " + context.getBundle().getSymbolicName() + "..........................." + new Date());
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        System.out.println("[INFO] Stopping " + context.getBundle().getSymbolicName() + "..........................." + new Date());
    }
}
