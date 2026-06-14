package com.mbridge.msdk.mbsignalcommon.mapping;

/* JADX INFO: loaded from: classes10.dex */
public class a extends Throwable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Class<?> f49766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f49767b;

    public a(String str) {
        super(str);
    }

    public void a(Class<?> cls) {
        this.f49766a = cls;
    }

    @Override // java.lang.Throwable
    public String toString() {
        if (getCause() == null) {
            return super.toString();
        }
        return getClass().getName() + ": " + getCause();
    }

    public a(Exception exc) {
        super(exc);
    }

    public void a(String str) {
        this.f49767b = str;
    }
}
