package androidx.test.platform.device;

/* JADX INFO: loaded from: classes5.dex */
public interface DeviceController {

    public enum ScreenOrientation {
        PORTRAIT,
        LANDSCAPE
    }

    void setDeviceMode(int i10);

    void setScreenOrientation(int i10);
}
