package yads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class cs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f109547a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f109548b = new SparseArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseBooleanArray f109549c = new SparseBooleanArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseBooleanArray f109550d = new SparseBooleanArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final bs f109551e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public bs f109552f;

    public cs(fm0 fm0Var, File file) {
        zr zrVar = new zr(fm0Var);
        as asVar = new as(new File(file, "monetization_cached_content_index.exi"));
        this.f109551e = zrVar;
        this.f109552f = asVar;
    }

    public final yr a(String str) {
        yr yrVar = (yr) this.f109547a.get(str);
        if (yrVar != null) {
            return yrVar;
        }
        SparseArray sparseArray = this.f109548b;
        int size = sparseArray.size();
        int i10 = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt < 0) {
            while (i10 < size && i10 == sparseArray.keyAt(i10)) {
                i10++;
            }
            iKeyAt = i10;
        }
        yr yrVar2 = new yr(iKeyAt, str, wb0.f117383c);
        this.f109547a.put(str, yrVar2);
        this.f109548b.put(iKeyAt, str);
        this.f109550d.put(iKeyAt, true);
        this.f109551e.a(yrVar2);
        return yrVar2;
    }

    public final void b(String str) {
        yr yrVar = (yr) this.f109547a.get(str);
        if (yrVar != null && yrVar.f118330c.isEmpty() && yrVar.f118331d.isEmpty()) {
            this.f109547a.remove(str);
            int i10 = yrVar.f118328a;
            boolean z10 = this.f109550d.get(i10);
            this.f109551e.a(yrVar, z10);
            if (z10) {
                this.f109548b.remove(i10);
                this.f109550d.delete(i10);
            } else {
                this.f109548b.put(i10, null);
                this.f109549c.put(i10, true);
            }
        }
    }

    public final void a(long j10) {
        bs bsVar;
        this.f109551e.a(j10);
        bs bsVar2 = this.f109552f;
        if (bsVar2 != null) {
            bsVar2.a(j10);
        }
        if (!this.f109551e.a() && (bsVar = this.f109552f) != null && bsVar.a()) {
            this.f109552f.a(this.f109547a, this.f109548b);
            this.f109551e.b(this.f109547a);
        } else {
            this.f109551e.a(this.f109547a, this.f109548b);
        }
        bs bsVar3 = this.f109552f;
        if (bsVar3 != null) {
            bsVar3.b();
            this.f109552f = null;
        }
    }

    public static wb0 a(DataInputStream dataInputStream) throws IOException {
        int i10 = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i11 = 0; i11 < i10; i11++) {
            String utf = dataInputStream.readUTF();
            int i12 = dataInputStream.readInt();
            if (i12 >= 0) {
                int iMin = Math.min(i12, 10485760);
                byte[] bArrCopyOf = w83.f117346f;
                int i13 = 0;
                while (i13 != i12) {
                    int i14 = i13 + iMin;
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, i14);
                    dataInputStream.readFully(bArrCopyOf, i13, iMin);
                    iMin = Math.min(i12 - i14, 10485760);
                    i13 = i14;
                }
                map.put(utf, bArrCopyOf);
            } else {
                throw new IOException(he2.a("Invalid value size: ", i12));
            }
        }
        return new wb0(map);
    }

    public final void a() {
        this.f109551e.a(this.f109547a);
        int size = this.f109549c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f109548b.remove(this.f109549c.keyAt(i10));
        }
        this.f109549c.clear();
        this.f109550d.clear();
    }
}
