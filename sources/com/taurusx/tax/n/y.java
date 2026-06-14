package com.taurusx.tax.n;

import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.vast.VastConfig;
import com.taurusx.tax.vast.VastFractionalProgressTracker;
import com.taurusx.tax.vast.VastManager;
import com.taurusx.tax.vast.VastTracker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class y {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static y f66395z;

    public static y z() {
        if (f66395z == null) {
            f66395z = new y();
        }
        return f66395z;
    }

    public void c(VastConfig vastConfig) {
        ArrayList<VastTracker> skipTrackers;
        if (vastConfig == null || (skipTrackers = vastConfig.getSkipTrackers()) == null) {
            return;
        }
        for (int i10 = 0; i10 < skipTrackers.size(); i10++) {
            LogUtil.i("taurusx", "sendSkipTrack skip i = " + i10 + " url = " + skipTrackers.get(i10).getContent());
            z.z(skipTrackers.get(i10).getContent(), VastManager.getVastNetworkMediaUrl(vastConfig));
        }
    }

    public void w(VastConfig vastConfig) {
        ArrayList<VastTracker> pauseTrackers;
        if (vastConfig == null || (pauseTrackers = vastConfig.getPauseTrackers()) == null) {
            return;
        }
        for (int i10 = 0; i10 < pauseTrackers.size(); i10++) {
            LogUtil.i("taurusx", "sendPauseTrack pause i = " + i10 + " url = " + pauseTrackers.get(i10).getContent());
            z.z(pauseTrackers.get(i10).getContent(), VastManager.getVastNetworkMediaUrl(vastConfig));
        }
    }

    public void y(VastConfig vastConfig) {
        ArrayList<VastTracker> resumeTrackers;
        if (vastConfig == null || (resumeTrackers = vastConfig.getResumeTrackers()) == null) {
            return;
        }
        for (int i10 = 0; i10 < resumeTrackers.size(); i10++) {
            LogUtil.i("taurusx", "sendResumeTrack resume i = " + i10 + " url = " + resumeTrackers.get(i10).getContent());
            z.z(resumeTrackers.get(i10).getContent(), VastManager.getVastNetworkMediaUrl(vastConfig));
        }
    }

    public void z(String str, VastConfig vastConfig) {
        z.z(str, VastManager.getVastNetworkMediaUrl(vastConfig));
    }

    public void z(int i10, VastConfig vastConfig) {
        ArrayList<VastTracker> completeTrackers;
        LogUtil.i("taurusx", "sendProgressTrack = " + i10);
        if (vastConfig != null) {
            int i11 = 0;
            if (i10 == 0) {
                ArrayList<String> startTrackers = vastConfig.getStartTrackers();
                if (startTrackers == null || startTrackers.size() <= 0) {
                    return;
                }
                while (i11 < startTrackers.size()) {
                    LogUtil.i("taurusx", "sendProgressTrack start i = " + i11 + " url = " + startTrackers.get(i11));
                    z.z(startTrackers.get(i11), VastManager.getVastNetworkMediaUrl(vastConfig));
                    i11++;
                }
                return;
            }
            if (i10 == 25) {
                ArrayList<VastFractionalProgressTracker> firstQuartileTrackers = vastConfig.getFirstQuartileTrackers();
                if (firstQuartileTrackers != null) {
                    while (i11 < firstQuartileTrackers.size()) {
                        LogUtil.i("taurusx", "sendProgressTrack 25 i = " + i11 + " url = " + firstQuartileTrackers.get(i11).getContent());
                        z.z(firstQuartileTrackers.get(i11).getContent(), VastManager.getVastNetworkMediaUrl(vastConfig));
                        i11++;
                    }
                    return;
                }
                return;
            }
            if (i10 == 50) {
                ArrayList<VastFractionalProgressTracker> midPointTrackers = vastConfig.getMidPointTrackers();
                if (midPointTrackers != null) {
                    while (i11 < midPointTrackers.size()) {
                        LogUtil.i("taurusx", "sendProgressTrack 50 i = " + i11 + " url = " + midPointTrackers.get(i11).getContent());
                        z.z(midPointTrackers.get(i11).getContent(), VastManager.getVastNetworkMediaUrl(vastConfig));
                        i11++;
                    }
                    return;
                }
                return;
            }
            if (i10 == 75) {
                ArrayList<VastFractionalProgressTracker> thirdQuartileTrackers = vastConfig.getThirdQuartileTrackers();
                if (thirdQuartileTrackers != null) {
                    while (i11 < thirdQuartileTrackers.size()) {
                        LogUtil.i("taurusx", "sendProgressTrack 75 i = " + i11 + " url = " + thirdQuartileTrackers.get(i11).getContent());
                        z.z(thirdQuartileTrackers.get(i11).getContent(), VastManager.getVastNetworkMediaUrl(vastConfig));
                        i11++;
                    }
                    return;
                }
                return;
            }
            if (i10 != 100 || (completeTrackers = vastConfig.getCompleteTrackers()) == null) {
                return;
            }
            while (i11 < completeTrackers.size()) {
                LogUtil.i("taurusx", "sendProgressTrack complete i = " + i11 + " url = " + completeTrackers.get(i11).getContent());
                z.z(completeTrackers.get(i11).getContent(), VastManager.getVastNetworkMediaUrl(vastConfig));
                i11++;
            }
        }
    }

    public void z(VastConfig vastConfig) {
        ArrayList<VastTracker> closeTrackers;
        if (vastConfig == null || (closeTrackers = vastConfig.getCloseTrackers()) == null) {
            return;
        }
        for (int i10 = 0; i10 < closeTrackers.size(); i10++) {
            LogUtil.i("taurusx", "sendCloseTrack close i = " + i10 + " url = " + closeTrackers.get(i10).getContent());
            z.z(closeTrackers.get(i10).getContent(), VastManager.getVastNetworkMediaUrl(vastConfig));
        }
    }
}
