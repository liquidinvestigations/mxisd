package io.kamax.mxisd.backend.liquid;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class LiquidBackend {

    private Logger log = LoggerFactory.getLogger(LiquidBackend.class);

    private boolean isEnabled;

    LiquidBackend(boolean isEnabled, String name) {
        this.isEnabled = isEnabled;
        if (!isEnabled) {
            return;
        }
    }

    public boolean isEnabled() {
        return isEnabled;
    }

}
