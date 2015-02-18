package org.main.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class MainEntryPoint implements EntryPoint {

    public MainEntryPoint() {
    }

    @Override
    public void onModuleLoad() {
        RootPanel.get().add(new HelloRpcServiceModel());
    }
}
