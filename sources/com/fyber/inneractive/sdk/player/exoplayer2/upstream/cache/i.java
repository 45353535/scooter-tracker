package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.util.p;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CachedContentIndex;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.c f22990c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f22993f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p f22994g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Cipher f22991d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SecretKeySpec f22992e = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f22988a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f22989b = new SparseArray();

    public i(File file) {
        this.f22990c = new com.fyber.inneractive.sdk.player.exoplayer2.util.c(new File(file, CachedContentIndex.FILE_NAME));
    }

    public final void a() {
        LinkedList linkedList = new LinkedList();
        for (h hVar : this.f22988a.values()) {
            if (hVar.f22986c.isEmpty()) {
                linkedList.add(hVar.f22985b);
            }
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            h hVar2 = (h) this.f22988a.remove((String) it.next());
            if (hVar2 != null) {
                if (!hVar2.f22986c.isEmpty()) {
                    throw new IllegalStateException();
                }
                this.f22989b.remove(hVar2.f22984a);
                this.f22993f = true;
            }
        }
    }

    public final void b() throws Throwable {
        DataOutputStream dataOutputStream;
        IOException e10;
        Throwable th2;
        if (this.f22993f) {
            DataOutputStream dataOutputStream2 = null;
            try {
                com.fyber.inneractive.sdk.player.exoplayer2.util.b bVarB = this.f22990c.b();
                p pVar = this.f22994g;
                if (pVar == null) {
                    this.f22994g = new p(bVarB);
                } else {
                    pVar.a(bVarB);
                }
                dataOutputStream = new DataOutputStream(this.f22994g);
            } catch (IOException e11) {
                dataOutputStream = dataOutputStream2;
                e10 = e11;
            } catch (Throwable th3) {
                th = th3;
                Throwable th4 = th;
                dataOutputStream = dataOutputStream2;
                th2 = th4;
                z.a(dataOutputStream);
                throw th2;
            }
            try {
                dataOutputStream.writeInt(1);
                dataOutputStream.writeInt(this.f22991d != null ? 1 : 0);
                if (this.f22991d != null) {
                    byte[] bArr = new byte[16];
                    new Random().nextBytes(bArr);
                    dataOutputStream.write(bArr);
                    try {
                        this.f22991d.init(1, this.f22992e, new IvParameterSpec(bArr));
                        dataOutputStream.flush();
                        dataOutputStream2 = new DataOutputStream(new CipherOutputStream(this.f22994g, this.f22991d));
                    } catch (InvalidAlgorithmParameterException e12) {
                        e = e12;
                        throw new IllegalStateException(e);
                    } catch (InvalidKeyException e13) {
                        e = e13;
                        throw new IllegalStateException(e);
                    }
                } else {
                    dataOutputStream2 = dataOutputStream;
                }
                dataOutputStream2.writeInt(this.f22988a.size());
                int i10 = 0;
                for (h hVar : this.f22988a.values()) {
                    dataOutputStream2.writeInt(hVar.f22984a);
                    dataOutputStream2.writeUTF(hVar.f22985b);
                    dataOutputStream2.writeLong(hVar.f22987d);
                    int iHashCode = (hVar.f22985b.hashCode() + (hVar.f22984a * 31)) * 31;
                    long j10 = hVar.f22987d;
                    i10 += iHashCode + ((int) (j10 ^ (j10 >>> 32)));
                }
                dataOutputStream2.writeInt(i10);
                com.fyber.inneractive.sdk.player.exoplayer2.util.c cVar = this.f22990c;
                cVar.getClass();
                dataOutputStream2.close();
                cVar.f23103b.delete();
                int i11 = z.f23162a;
                this.f22993f = false;
            } catch (IOException e14) {
                e10 = e14;
                try {
                    throw new a(e10);
                } catch (Throwable th5) {
                    DataOutputStream dataOutputStream3 = dataOutputStream;
                    th = th5;
                    dataOutputStream2 = dataOutputStream3;
                    Throwable th42 = th;
                    dataOutputStream = dataOutputStream2;
                    th2 = th42;
                    z.a(dataOutputStream);
                    throw th2;
                }
            } catch (Throwable th6) {
                th2 = th6;
                z.a(dataOutputStream);
                throw th2;
            }
        }
    }

    public final h a(String str, long j10) {
        SparseArray sparseArray = this.f22989b;
        int size = sparseArray.size();
        int i10 = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt < 0) {
            while (i10 < size && i10 == sparseArray.keyAt(i10)) {
                i10++;
            }
            iKeyAt = i10;
        }
        h hVar = new h(iKeyAt, str, j10);
        this.f22988a.put(str, hVar);
        this.f22989b.put(iKeyAt, str);
        this.f22993f = true;
        return hVar;
    }
}
