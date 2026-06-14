package io.bidmachine;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class BuildInfo {

    @Nullable
    private static volatile BuildInfo instance;

    @NonNull
    private final ce.a isDebuggable;

    @Nullable
    private volatile String sha1Signature = null;

    @Nullable
    private volatile String sha256Signature = null;

    private BuildInfo(@NonNull final Context context) {
        this.isDebuggable = new ce.a(new ce.b() { // from class: io.bidmachine.w2
            @Override // ce.b
            public final Object get() {
                return Boolean.valueOf((context.getApplicationInfo().flags & 2) != 0);
            }
        });
    }

    @NonNull
    public static BuildInfo obtain(@NonNull Context context) {
        BuildInfo buildInfo;
        BuildInfo buildInfo2 = instance;
        if (buildInfo2 != null) {
            return buildInfo2;
        }
        synchronized (BuildInfo.class) {
            try {
                buildInfo = instance;
                if (buildInfo == null) {
                    buildInfo = new BuildInfo(context.getApplicationContext());
                    instance = buildInfo;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return buildInfo;
    }

    @Nullable
    public String getSha1Signature(@NonNull Context context) {
        String str = this.sha1Signature;
        if (str != null) {
            return str;
        }
        String strM = ae.c.m(context);
        this.sha1Signature = strM;
        return strM;
    }

    @Nullable
    public String getSha256Signature(@NonNull Context context) {
        String str = this.sha256Signature;
        if (str != null) {
            return str;
        }
        String strN = ae.c.n(context);
        this.sha256Signature = strN;
        return strN;
    }

    public boolean isDebuggable() {
        return ((Boolean) this.isDebuggable.get()).booleanValue();
    }
}
