package io.kamax.mxisd.backend.liquid;

import io.kamax.matrix.MatrixID;
import io.kamax.matrix.ThreePidMedium;
import io.kamax.mxisd.lookup.SingleLookupReply;
import io.kamax.mxisd.lookup.SingleLookupRequest;
import io.kamax.mxisd.lookup.ThreePidMapping;
import io.kamax.mxisd.lookup.provider.IThreePidProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class LiquidProvider extends LiquidBackend implements IThreePidProvider {

    private Logger log = LoggerFactory.getLogger(LiquidProvider.class);

    public LiquidProvider(boolean isEnabled) {
        super(isEnabled, "ThreePidProvider");
    }

    @Override
    public boolean isLocal() {
        return true;
    }

    @Override
    public int getPriority() {
        return 25;
    }

    @Override
    public Optional<SingleLookupReply> find(SingleLookupRequest request) {
        return null;
    }

    @Override
    public List<ThreePidMapping> populate(List<ThreePidMapping> mappings) {
        List<ThreePidMapping> results = new ArrayList<>();
        return results;
    }

}
