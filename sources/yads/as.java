package yads;

import android.util.SparseArray;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public final class as implements bs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f108759a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Cipher f108760b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SecretKeySpec f108761c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SecureRandom f108762d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yj f108763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f108764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public do2 f108765g;

    public as(File file) {
        this.f108763e = new yj(file);
    }

    @Override // yads.bs
    public final void a(long j10) {
    }

    @Override // yads.bs
    public final void b() {
        yj yjVar = this.f108763e;
        yjVar.f118242a.delete();
        yjVar.f118243b.delete();
    }

    @Override // yads.bs
    public final boolean a() {
        yj yjVar = this.f108763e;
        return yjVar.f118242a.exists() || yjVar.f118243b.exists();
    }

    public static int a(yr yrVar, int i10) {
        int iHashCode = yrVar.f118329b.hashCode() + (yrVar.f118328a * 31);
        if (i10 < 2) {
            long jA = j5.a(yrVar.f118332e);
            return (iHashCode * 31) + ((int) (jA ^ (jA >>> 32)));
        }
        return yrVar.f118332e.hashCode() + (iHashCode * 31);
    }

    @Override // yads.bs
    public final void b(HashMap map) throws Throwable {
        DataOutputStream dataOutputStream;
        do2 do2Var;
        DataOutputStream dataOutputStream2 = null;
        try {
            xj xjVarB = this.f108763e.b();
            do2 do2Var2 = this.f108765g;
            if (do2Var2 == null) {
                this.f108765g = new do2(xjVarB);
            } else {
                do2Var2.a(xjVarB);
            }
            do2Var = this.f108765g;
            dataOutputStream = new DataOutputStream(do2Var);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            dataOutputStream.writeInt(2);
            dataOutputStream.writeInt(this.f108759a ? 1 : 0);
            if (this.f108759a) {
                byte[] bArr = new byte[16];
                SecureRandom secureRandom = this.f108762d;
                int i10 = w83.f117341a;
                secureRandom.nextBytes(bArr);
                dataOutputStream.write(bArr);
                try {
                    this.f108760b.init(1, this.f108761c, new IvParameterSpec(bArr));
                    dataOutputStream.flush();
                    dataOutputStream = new DataOutputStream(new CipherOutputStream(do2Var, this.f108760b));
                } catch (InvalidAlgorithmParameterException e10) {
                    e = e10;
                    throw new IllegalStateException(e);
                } catch (InvalidKeyException e11) {
                    e = e11;
                    throw new IllegalStateException(e);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            w83.a((Closeable) dataOutputStream);
            throw th;
        }
        try {
            dataOutputStream.writeInt(map.size());
            int iA = 0;
            for (yr yrVar : map.values()) {
                dataOutputStream.writeInt(yrVar.f118328a);
                dataOutputStream.writeUTF(yrVar.f118329b);
                Set<Map.Entry> setEntrySet = yrVar.f118332e.f117385b.entrySet();
                dataOutputStream.writeInt(setEntrySet.size());
                for (Map.Entry entry : setEntrySet) {
                    dataOutputStream.writeUTF((String) entry.getKey());
                    byte[] bArr2 = (byte[]) entry.getValue();
                    dataOutputStream.writeInt(bArr2.length);
                    dataOutputStream.write(bArr2);
                }
                iA += a(yrVar, 2);
            }
            dataOutputStream.writeInt(iA);
            yj yjVar = this.f108763e;
            yjVar.getClass();
            dataOutputStream.close();
            yjVar.f118243b.delete();
            int i11 = w83.f117341a;
            this.f108764f = false;
        } catch (Throwable th4) {
            th = th4;
            dataOutputStream2 = dataOutputStream;
            dataOutputStream = dataOutputStream2;
            w83.a((Closeable) dataOutputStream);
            throw th;
        }
    }

    @Override // yads.bs
    public final void a(HashMap map, SparseArray sparseArray) throws Throwable {
        if (!this.f108764f) {
            yj yjVar = this.f108763e;
            if (yjVar.f118242a.exists() || yjVar.f118243b.exists()) {
                DataInputStream dataInputStream = null;
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(this.f108763e.a());
                    DataInputStream dataInputStream2 = new DataInputStream(bufferedInputStream);
                    try {
                        int i10 = dataInputStream2.readInt();
                        if (i10 >= 0 && i10 <= 2) {
                            if ((dataInputStream2.readInt() & 1) != 0) {
                                if (this.f108760b != null) {
                                    byte[] bArr = new byte[16];
                                    dataInputStream2.readFully(bArr);
                                    IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                                    try {
                                        Cipher cipher = this.f108760b;
                                        SecretKeySpec secretKeySpec = this.f108761c;
                                        int i11 = w83.f117341a;
                                        cipher.init(2, secretKeySpec, ivParameterSpec);
                                        dataInputStream2 = new DataInputStream(new CipherInputStream(bufferedInputStream, this.f108760b));
                                    } catch (InvalidAlgorithmParameterException e10) {
                                        e = e10;
                                        throw new IllegalStateException(e);
                                    } catch (InvalidKeyException e11) {
                                        e = e11;
                                        throw new IllegalStateException(e);
                                    }
                                } else {
                                    w83.a((Closeable) dataInputStream2);
                                }
                            } else if (this.f108759a) {
                                this.f108764f = true;
                            }
                            int i12 = dataInputStream2.readInt();
                            int iA = 0;
                            for (int i13 = 0; i13 < i12; i13++) {
                                yr yrVarA = a(i10, dataInputStream2);
                                map.put(yrVarA.f118329b, yrVarA);
                                sparseArray.put(yrVarA.f118328a, yrVarA.f118329b);
                                iA += a(yrVarA, i10);
                            }
                            int i14 = dataInputStream2.readInt();
                            boolean z10 = dataInputStream2.read() == -1;
                            if (i14 == iA && z10) {
                                w83.a((Closeable) dataInputStream2);
                                return;
                            }
                            w83.a((Closeable) dataInputStream2);
                        } else {
                            w83.a((Closeable) dataInputStream2);
                        }
                    } catch (IOException unused) {
                        dataInputStream = dataInputStream2;
                        if (dataInputStream != null) {
                            w83.a((Closeable) dataInputStream);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        dataInputStream = dataInputStream2;
                        if (dataInputStream != null) {
                            w83.a((Closeable) dataInputStream);
                        }
                        throw th;
                    }
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    th = th3;
                }
                map.clear();
                sparseArray.clear();
                yj yjVar2 = this.f108763e;
                yjVar2.f118242a.delete();
                yjVar2.f118243b.delete();
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }

    @Override // yads.bs
    public final void a(yr yrVar, boolean z10) {
        this.f108764f = true;
    }

    @Override // yads.bs
    public final void a(yr yrVar) {
        this.f108764f = true;
    }

    public static yr a(int i10, DataInputStream dataInputStream) throws IOException {
        wb0 wb0VarA;
        int i11 = dataInputStream.readInt();
        String utf = dataInputStream.readUTF();
        if (i10 < 2) {
            long j10 = dataInputStream.readLong();
            dz dzVar = new dz();
            dzVar.f110112a.put("exo_len", Long.valueOf(j10));
            dzVar.f110113b.remove("exo_len");
            wb0VarA = wb0.f117383c.a(dzVar);
        } else {
            wb0VarA = cs.a(dataInputStream);
        }
        return new yr(i11, utf, wb0VarA);
    }

    @Override // yads.bs
    public final void a(HashMap map) throws Throwable {
        if (this.f108764f) {
            b(map);
        }
    }
}
