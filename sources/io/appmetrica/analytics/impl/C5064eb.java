package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.eb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5064eb implements Parcelable {
    public static final Parcelable.Creator<C5064eb> CREATOR = new C5039db();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResultReceiver f77103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f77104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f77105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f77106d;

    public C5064eb(I6 i62, List list, Map map, boolean z10) {
        this.f77104b = list;
        this.f77103a = i62;
        this.f77105c = map == null ? new HashMap() : new HashMap(map);
        this.f77106d = z10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.internal.CounterConfiguration.receiver", this.f77103a);
        if (this.f77104b != null) {
            bundle.putStringArrayList("io.appmetrica.analytics.internal.CounterConfiguration.identifiersList", new ArrayList<>(this.f77104b));
        }
        HashMap map = this.f77105c;
        if (map != null) {
            bundle.putString("io.appmetrica.analytics.internal.CounterConfiguration.clidsForVerification", Jm.a((Map) map));
        }
        bundle.putBoolean("io.appmetrica.analytics.internal.CounterConfiguration.forceRefreshConfiguration", this.f77106d);
        parcel.writeBundle(bundle);
    }

    public C5064eb(Parcel parcel) {
        Bundle bundle = parcel.readBundle(I6.class.getClassLoader());
        if (bundle != null) {
            this.f77103a = (ResultReceiver) bundle.getParcelable("io.appmetrica.analytics.internal.CounterConfiguration.receiver");
            this.f77104b = bundle.getStringArrayList("io.appmetrica.analytics.internal.CounterConfiguration.identifiersList");
            this.f77105c = Jm.a(bundle.getString("io.appmetrica.analytics.internal.CounterConfiguration.clidsForVerification"));
            this.f77106d = bundle.getBoolean("io.appmetrica.analytics.internal.CounterConfiguration.forceRefreshConfiguration");
            return;
        }
        this.f77105c = new HashMap();
    }
}
