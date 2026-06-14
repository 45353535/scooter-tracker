package io.appmetrica.analytics.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class Ze implements Yc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f76749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f76751c;

    public Ze(@NotNull Context context, @NotNull String str, @NotNull String str2) {
        this.f76749a = context;
        this.f76750b = str;
        this.f76751c = str2;
    }

    @NotNull
    public final Ze a(@NotNull Context context, @NotNull String str, @NotNull String str2) {
        return new Ze(context, str, str2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ze)) {
            return false;
        }
        Ze ze2 = (Ze) obj;
        return Intrinsics.areEqual(this.f76749a, ze2.f76749a) && Intrinsics.areEqual(this.f76750b, ze2.f76750b) && Intrinsics.areEqual(this.f76751c, ze2.f76751c);
    }

    public final int hashCode() {
        return this.f76751c.hashCode() + ((this.f76750b.hashCode() + (this.f76749a.hashCode() * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "PreferencesBasedModuleEntryPoint(context=" + this.f76749a + ", prefName=" + this.f76750b + ", prefValueName=" + this.f76751c + ')';
    }

    public static Ze a(Ze ze2, Context context, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            context = ze2.f76749a;
        }
        if ((i10 & 2) != 0) {
            str = ze2.f76750b;
        }
        if ((i10 & 4) != 0) {
            str2 = ze2.f76751c;
        }
        ze2.getClass();
        return new Ze(context, str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Yc
    @NotNull
    public final String a() {
        String string = this.f76749a.getSharedPreferences(this.f76750b, 0).getString(this.f76751c, "");
        return string == null ? "" : string;
    }
}
