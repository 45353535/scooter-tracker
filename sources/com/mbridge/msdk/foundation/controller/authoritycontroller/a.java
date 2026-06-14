package com.mbridge.msdk.foundation.controller.authoritycontroller;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f48277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f48278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f48279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f48280d;

    protected void a(int i10) {
        this.f48277a = i10;
        this.f48278b = i10;
        this.f48279c = i10;
    }

    public void authDeviceIdStatus(int i10) {
        this.f48278b = i10;
    }

    public void authGenDataStatus(int i10) {
        this.f48277a = i10;
    }

    public void authOtherDataStatus(int i10) {
        this.f48280d = i10;
    }

    public void authSerialIdStatus(int i10) {
        this.f48279c = i10;
    }

    public int getAuthDeviceIdStatus() {
        return this.f48278b;
    }

    public int getAuthGenDataStatus() {
        return this.f48277a;
    }

    public int getAuthSerialIdStatus() {
        return this.f48279c;
    }

    public int getOtherDataStatus() {
        return this.f48280d;
    }

    public int getStatusByKey(String str) {
        if (!TextUtils.isEmpty(str)) {
            str.getClass();
            switch (str) {
                case "authority_serial_id":
                    return this.f48279c;
                case "authority_device_id":
                    return this.f48278b;
                case "authority_general_data":
                    return this.f48277a;
                case "authority_other":
                    return this.f48280d;
            }
        }
        return 1;
    }
}
