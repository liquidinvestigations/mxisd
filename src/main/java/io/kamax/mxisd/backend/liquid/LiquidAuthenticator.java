package io.kamax.mxisd.backend.liquid;

import io.kamax.matrix.ThreePidMedium;
import io.kamax.matrix._MatrixID;
import io.kamax.mxisd.ThreePid;
import io.kamax.mxisd.UserIdType;
import io.kamax.mxisd.auth.provider.AuthenticatorProvider;
import io.kamax.mxisd.auth.provider.BackendAuthResult;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class LiquidAuthenticator extends LiquidBackend implements AuthenticatorProvider {

    private Logger log = LoggerFactory.getLogger(LiquidAuthenticator.class);

    public LiquidAuthenticator(boolean isEnabled) {
        super(isEnabled, "AuthenticationProvider");
    }

    @Override
    public BackendAuthResult authenticate(_MatrixID mxid, String password) {
        if (!isEnabled()) {
            throw new IllegalStateException();
        }

        log.info("Trying to authenticate {}", mxid);

        final BackendAuthResult result = BackendAuthResult.failure();

        return result;
    }

}
