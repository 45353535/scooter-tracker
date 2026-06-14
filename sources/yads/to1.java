package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class to1 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<to1> CREATOR = new so1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f116308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f116309c;

    public to1(ArrayList arrayList, Map map) {
        this.f116308b = arrayList;
        this.f116309c = map;
    }

    public final List c() {
        return this.f116308b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f116308b;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((cp1) it.next()).writeToParcel(parcel, i10);
        }
        Map map = this.f116309c;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
