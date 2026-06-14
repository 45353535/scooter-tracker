package sg.bigo.ads.common;

import android.os.Parcel;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sg.bigo.ads.common.f;

/* JADX INFO: loaded from: classes4.dex */
public final class n {
    public static int a(@NonNull Parcel parcel, int i10) {
        return parcel.dataAvail() > 0 ? parcel.readInt() : i10;
    }

    @NonNull
    public static <K extends f, V extends f> Map<K, List<V>> b(@NonNull Parcel parcel, @Nullable f.a<K> aVar, @Nullable f.a<V> aVar2) {
        HashMap map = new HashMap();
        if (parcel.dataAvail() > 0) {
            for (int i10 = parcel.readInt(); i10 > 0; i10--) {
                f fVarB = b(parcel, aVar);
                List listA = a(parcel, aVar2);
                if (fVarB != null && !sg.bigo.ads.common.utils.k.a((Collection) listA)) {
                    map.put(fVarB, listA);
                }
            }
        }
        return map;
    }

    public static long a(@NonNull Parcel parcel, long j10) {
        return parcel.dataAvail() > 0 ? parcel.readLong() : j10;
    }

    @Nullable
    public static <T extends f> T b(@NonNull Parcel parcel, @Nullable f.a<T> aVar) {
        T t10 = null;
        if (parcel.dataAvail() <= 0) {
            return null;
        }
        int i10 = parcel.readInt();
        if (i10 != 0 && i10 <= parcel.dataAvail()) {
            byte[] bArr = new byte[i10];
            parcel.readByteArray(bArr);
            if (aVar != null) {
                t10 = (T) aVar.a();
            }
            if (t10 != null) {
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.unmarshall(bArr, 0, i10);
                parcelObtain.setDataPosition(0);
                t10.b(parcelObtain);
            }
        }
        return t10;
    }

    public static String a(@NonNull Parcel parcel, String str) {
        return parcel.dataAvail() > 0 ? parcel.readString() : str;
    }

    public static <K extends f, V extends f> void b(@NonNull Parcel parcel, @Nullable Map<K, List<V>> map) {
        int size = map == null ? 0 : map.size();
        parcel.writeInt(size);
        if (size == 0) {
            return;
        }
        for (Map.Entry<K, List<V>> entry : map.entrySet()) {
            a(parcel, entry.getKey());
            a(parcel, entry.getValue());
        }
    }

    @NonNull
    public static <T extends f> List<T> a(@NonNull Parcel parcel, @Nullable f.a<T> aVar) {
        ArrayList arrayList = new ArrayList();
        if (parcel.dataAvail() > 0) {
            for (int i10 = parcel.readInt(); i10 > 0; i10--) {
                f fVarB = b(parcel, aVar);
                if (fVarB != null) {
                    arrayList.add(fVarB);
                }
            }
        }
        return arrayList;
    }

    public static <T extends f> boolean b(@NonNull Parcel parcel, @Nullable T t10) {
        int i10;
        if (parcel.dataAvail() <= 0 || (i10 = parcel.readInt()) == 0 || i10 > parcel.dataAvail()) {
            return false;
        }
        byte[] bArr = new byte[i10];
        parcel.readByteArray(bArr);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, i10);
        parcelObtain.setDataPosition(0);
        if (t10 == null) {
            return true;
        }
        t10.b(parcelObtain);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.Map<java.lang.String, T extends sg.bigo.ads.common.f>] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Map<java.lang.String, T extends sg.bigo.ads.common.f>] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.HashMap, java.util.Map] */
    public static <T extends f> Map<String, T> a(@NonNull Parcel parcel, @Nullable f.a<T> aVar, Map<String, T> map) {
        String string;
        if (parcel.dataAvail() > 0) {
            map = new HashMap();
            if (parcel.dataAvail() > 0) {
                for (int i10 = parcel.readInt(); i10 > 0; i10--) {
                    f fVarA = aVar != null ? aVar.a() : null;
                    if (b(parcel, fVarA) && (string = parcel.readString()) != null && fVarA != null) {
                        map.put(string, fVarA);
                    }
                }
            }
        }
        return (Map<String, T>) map;
    }

    public static boolean b(@NonNull Parcel parcel, boolean z10) {
        return parcel.dataAvail() > 0 ? parcel.readInt() != 0 : z10;
    }

    @NonNull
    public static <K extends f, V extends f> Map<K, V> a(@NonNull Parcel parcel, @Nullable f.a<K> aVar, @Nullable f.a<V> aVar2) {
        HashMap map = new HashMap();
        if (parcel.dataAvail() > 0) {
            for (int i10 = parcel.readInt(); i10 > 0; i10--) {
                f fVarB = b(parcel, aVar);
                f fVarB2 = b(parcel, aVar2);
                if (fVarB != null && fVarB2 != null) {
                    map.put(fVarB, fVarB2);
                }
            }
        }
        return map;
    }

    public static <T extends f> void a(@NonNull Parcel parcel, @Nullable Collection<T> collection) {
        int size = collection == null ? 0 : collection.size();
        parcel.writeInt(size);
        if (size == 0) {
            return;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            a(parcel, it.next());
        }
    }

    public static <K extends f, V extends f> void a(@NonNull Parcel parcel, @Nullable Map<K, V> map) {
        int size = map == null ? 0 : map.size();
        parcel.writeInt(size);
        if (size == 0) {
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            a(parcel, key);
            a(parcel, value);
        }
    }

    public static <T extends f> void a(@NonNull Parcel parcel, @Nullable T t10) {
        if (t10 == null) {
            parcel.writeInt(0);
            return;
        }
        Parcel parcelObtain = Parcel.obtain();
        t10.a(parcelObtain);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcel.writeInt(bArrMarshall.length);
        parcel.writeByteArray(bArrMarshall);
    }

    public static void a(@NonNull Parcel parcel, boolean z10) {
        parcel.writeInt(z10 ? 1 : 0);
    }
}
