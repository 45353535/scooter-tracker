package coil.memory;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import c0.i;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.ironsource.C4240b4;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import w.d;
import w.e;
import w.f;
import w.g;
import w.h;

/* JADX INFO: loaded from: classes5.dex */
public interface MemoryCache {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f6943a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private double f6944b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f6945c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f6946d = true;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f6947e = true;

        public a(Context context) {
            this.f6943a = context;
            this.f6944b = i.e(context);
        }

        public final MemoryCache a() {
            g aVar;
            h fVar = this.f6947e ? new f() : new w.b();
            if (this.f6946d) {
                double d10 = this.f6944b;
                int iC = d10 > 0.0d ? i.c(this.f6943a, d10) : this.f6945c;
                aVar = iC > 0 ? new e(iC, fVar) : new w.a(fVar);
            } else {
                aVar = new w.a(fVar);
            }
            return new d(aVar, fVar);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Bitmap f6948a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f6949b;

        public b(Bitmap bitmap, Map map) {
            this.f6948a = bitmap;
            this.f6949b = map;
        }

        public final Bitmap a() {
            return this.f6948a;
        }

        public final Map b() {
            return this.f6949b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f6948a, bVar.f6948a) && Intrinsics.areEqual(this.f6949b, bVar.f6949b);
        }

        public int hashCode() {
            return (this.f6948a.hashCode() * 31) + this.f6949b.hashCode();
        }

        public String toString() {
            return "Value(bitmap=" + this.f6948a + ", extras=" + this.f6949b + ')';
        }
    }

    void a(int i10);

    b b(Key key);

    void c(Key key, b bVar);

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u0000 !2\u00020\u0001:\u0001\u001bB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0011J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0013R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006\""}, d2 = {"Lcoil/memory/MemoryCache$Key;", "Landroid/os/Parcelable;", "", C4240b4.i.W, "", HandleInvocationsFromAdViewer.KEY_EXTRAS, "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "a", "(Ljava/lang/String;Ljava/util/Map;)Lcoil/memory/MemoryCache$Key;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "Ljava/lang/String;", "getKey", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "Ljava/util/Map;", "()Ljava/util/Map;", "d", "coil-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Key implements Parcelable {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String key;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map extras;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final b f6940d = new b(null);

        @Deprecated
        @NotNull
        public static final Parcelable.Creator<Key> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Key createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                Intrinsics.checkNotNull(string);
                int i10 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i10);
                for (int i11 = 0; i11 < i10; i11++) {
                    String string2 = parcel.readString();
                    Intrinsics.checkNotNull(string2);
                    String string3 = parcel.readString();
                    Intrinsics.checkNotNull(string3);
                    linkedHashMap.put(string2, string3);
                }
                return new Key(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Key[] newArray(int i10) {
                return new Key[i10];
            }
        }

        private static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
            }
        }

        public Key(String str, Map map) {
            this.key = str;
            this.extras = map;
        }

        public static /* synthetic */ Key b(Key key, String str, Map map, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = key.key;
            }
            if ((i10 & 2) != 0) {
                map = key.extras;
            }
            return key.a(str, map);
        }

        public final Key a(String key, Map extras) {
            return new Key(key, extras);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Map getExtras() {
            return this.extras;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Key)) {
                return false;
            }
            Key key = (Key) other;
            return Intrinsics.areEqual(this.key, key.key) && Intrinsics.areEqual(this.extras, key.extras);
        }

        public int hashCode() {
            return (this.key.hashCode() * 31) + this.extras.hashCode();
        }

        public String toString() {
            return "Key(key=" + this.key + ", extras=" + this.extras + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.key);
            parcel.writeInt(this.extras.size());
            for (Map.Entry entry : this.extras.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                parcel.writeString(str);
                parcel.writeString(str2);
            }
        }

        public /* synthetic */ Key(String str, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? MapsKt.emptyMap() : map);
        }
    }
}
