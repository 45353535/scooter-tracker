package com.yandex.div.evaluable.types;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.taurusx.tax.f.y;
import java.net.MalformedURLException;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/yandex/div/evaluable/types/Url;", "", "", "value", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "toString-impl", "toString", "", "hashCode-impl", "(Ljava/lang/String;)I", "hashCode", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "equals", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", y.f66058y, "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Url {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String value;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/yandex/div/evaluable/types/Url$Companion;", "", "()V", TypedValues.TransitionType.S_FROM, "Lcom/yandex/div/evaluable/types/Url;", "urlString", "", "from-VcSV9u8", "(Ljava/lang/String;)Ljava/lang/String;", "isValid", "", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean isValid(String urlString) {
            try {
                new URL(urlString);
                return true;
            } catch (MalformedURLException unused) {
                return false;
            }
        }

        @NotNull
        /* JADX INFO: renamed from: from-VcSV9u8, reason: not valid java name */
        public final String m7677fromVcSV9u8(@NotNull String urlString) throws IllegalArgumentException {
            Intrinsics.checkNotNullParameter(urlString, "urlString");
            if (isValid(urlString)) {
                return Url.m7671constructorimpl(urlString);
            }
            throw new IllegalArgumentException("Invalid url " + urlString);
        }

        private Companion() {
        }
    }

    private /* synthetic */ Url(String str) {
        this.value = str;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Url m7670boximpl(String str) {
        return new Url(str);
    }

    @NotNull
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static String m7671constructorimpl(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m7672equalsimpl(String str, Object obj) {
        return (obj instanceof Url) && Intrinsics.areEqual(str, ((Url) obj).getValue());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7673equalsimpl0(String str, String str2) {
        return Intrinsics.areEqual(str, str2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m7674hashCodeimpl(String str) {
        return str.hashCode();
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m7675toStringimpl(String str) {
        return str;
    }

    public boolean equals(Object obj) {
        return m7672equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m7674hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m7675toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ String getValue() {
        return this.value;
    }
}
