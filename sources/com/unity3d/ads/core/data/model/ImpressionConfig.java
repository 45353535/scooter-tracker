package com.unity3d.ads.core.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/data/model/ImpressionConfig;", "", "data", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getData", "()Ljava/lang/String;", "equals", "", "other", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ImpressionConfig {

    @NotNull
    private final String data;

    private /* synthetic */ ImpressionConfig(String str) {
        this.data = str;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ImpressionConfig m7454boximpl(String str) {
        return new ImpressionConfig(str);
    }

    @NotNull
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static String m7455constructorimpl(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return data;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m7456equalsimpl(String str, Object obj) {
        return (obj instanceof ImpressionConfig) && Intrinsics.areEqual(str, ((ImpressionConfig) obj).m7460unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7457equalsimpl0(String str, String str2) {
        return Intrinsics.areEqual(str, str2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m7458hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m7459toStringimpl(String str) {
        return "ImpressionConfig(data=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m7456equalsimpl(this.data, obj);
    }

    @NotNull
    public final String getData() {
        return this.data;
    }

    public int hashCode() {
        return m7458hashCodeimpl(this.data);
    }

    public String toString() {
        return m7459toStringimpl(this.data);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m7460unboximpl() {
        return this.data;
    }
}
