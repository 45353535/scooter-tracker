package com.google.firebase.components;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;

/* JADX INFO: loaded from: classes9.dex */
public final class Dependency {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Qualified f31799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f31800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f31801c;

    private Dependency(Class cls, int i10, int i11) {
        this(Qualified.unqualified(cls), i10, i11);
    }

    private static String a(int i10) {
        if (i10 == 0) {
            return DevicePublicKeyStringDef.DIRECT;
        }
        if (i10 == 1) {
            return IronSourceConstants.EVENTS_PROVIDER;
        }
        if (i10 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i10);
    }

    public static Dependency deferred(Class<?> cls) {
        return new Dependency(cls, 0, 2);
    }

    @Deprecated
    public static Dependency optional(Class<?> cls) {
        return new Dependency(cls, 0, 0);
    }

    public static Dependency optionalProvider(Class<?> cls) {
        return new Dependency(cls, 0, 1);
    }

    public static Dependency required(Class<?> cls) {
        return new Dependency(cls, 1, 0);
    }

    public static Dependency requiredProvider(Class<?> cls) {
        return new Dependency(cls, 1, 1);
    }

    public static Dependency setOf(Class<?> cls) {
        return new Dependency(cls, 2, 0);
    }

    public static Dependency setOfProvider(Class<?> cls) {
        return new Dependency(cls, 2, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Dependency) {
            Dependency dependency = (Dependency) obj;
            if (this.f31799a.equals(dependency.f31799a) && this.f31800b == dependency.f31800b && this.f31801c == dependency.f31801c) {
                return true;
            }
        }
        return false;
    }

    public Qualified<?> getInterface() {
        return this.f31799a;
    }

    public int hashCode() {
        return ((((this.f31799a.hashCode() ^ 1000003) * 1000003) ^ this.f31800b) * 1000003) ^ this.f31801c;
    }

    public boolean isDeferred() {
        return this.f31801c == 2;
    }

    public boolean isDirectInjection() {
        return this.f31801c == 0;
    }

    public boolean isRequired() {
        return this.f31800b == 1;
    }

    public boolean isSet() {
        return this.f31800b == 2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f31799a);
        sb2.append(", type=");
        int i10 = this.f31800b;
        sb2.append(i10 == 1 ? POBCoreNativeConstants.NATIVE_REQUIRED_FIELD : i10 == 0 ? "optional" : "set");
        sb2.append(", injection=");
        sb2.append(a(this.f31801c));
        sb2.append("}");
        return sb2.toString();
    }

    private Dependency(Qualified qualified, int i10, int i11) {
        this.f31799a = (Qualified) Preconditions.checkNotNull(qualified, "Null dependency anInterface.");
        this.f31800b = i10;
        this.f31801c = i11;
    }

    public static Dependency deferred(Qualified<?> qualified) {
        return new Dependency(qualified, 0, 2);
    }

    public static Dependency optionalProvider(Qualified<?> qualified) {
        return new Dependency(qualified, 0, 1);
    }

    public static Dependency required(Qualified<?> qualified) {
        return new Dependency(qualified, 1, 0);
    }

    public static Dependency requiredProvider(Qualified<?> qualified) {
        return new Dependency(qualified, 1, 1);
    }

    public static Dependency setOf(Qualified<?> qualified) {
        return new Dependency(qualified, 2, 0);
    }

    public static Dependency setOfProvider(Qualified<?> qualified) {
        return new Dependency(qualified, 2, 1);
    }
}
