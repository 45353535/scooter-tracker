package com.taurusx.tax.w.s;

import android.view.InputDevice;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f67463c;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f67464o = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f67465s = "";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f67466w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f67467y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f67468z;

    public String toString() {
        return "TouchInfo{downTs=" + this.f67468z + ", upTs=" + this.f67466w + ", downTime=" + this.f67467y + ", upTime=" + this.f67463c + ", touchDeviceId=" + this.f67464o + ", touchDeviceName='" + this.f67465s + "'}";
    }

    public void z(MotionEvent motionEvent) {
        InputDevice device;
        if (motionEvent == null || (device = motionEvent.getDevice()) == null) {
            return;
        }
        this.f67464o = device.getId();
        this.f67465s = device.getName();
    }
}
