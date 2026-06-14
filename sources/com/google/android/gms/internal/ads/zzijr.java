package com.google.android.gms.internal.ads;

import com.ironsource.C4240b4;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes8.dex */
public class zzijr implements Iterator, Closeable, zzatk, AutoCloseable {
    private static final zzatj zza = new zzijq("eof ");
    protected zzatg zzb;
    protected zzijs zzc;
    zzatj zzd = null;
    long zze = 0;
    long zzf = 0;
    private final List zzg = new ArrayList();

    static {
        zzijy.zzb(zzijr.class);
    }

    public void close() throws IOException {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zzatj zzatjVar = this.zzd;
        if (zzatjVar == zza) {
            return false;
        }
        if (zzatjVar != null) {
            return true;
        }
        try {
            this.zzd = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.zzd = zza;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append(C4240b4.j.f42672d);
        int i10 = 0;
        while (true) {
            List list = this.zzg;
            if (i10 >= list.size()) {
                sb2.append(C4240b4.j.f42674e);
                return sb2.toString();
            }
            if (i10 > 0) {
                sb2.append(";");
            }
            sb2.append(((zzatj) list.get(i10)).toString());
            i10++;
        }
    }

    public final List zzc() {
        return (this.zzc == null || this.zzd == zza) ? this.zzg : new zzijx(this.zzg, this);
    }

    public final void zzd(zzijs zzijsVar, long j10, zzatg zzatgVar) throws IOException {
        this.zzc = zzijsVar;
        this.zze = zzijsVar.zzc();
        zzijsVar.zzd(zzijsVar.zzc() + j10);
        this.zzf = zzijsVar.zzc();
        this.zzb = zzatgVar;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzatj next() {
        zzatj zzatjVarZzb;
        zzatj zzatjVar = this.zzd;
        if (zzatjVar != null && zzatjVar != zza) {
            this.zzd = null;
            return zzatjVar;
        }
        zzijs zzijsVar = this.zzc;
        if (zzijsVar == null || this.zze >= this.zzf) {
            this.zzd = zza;
            throw new NoSuchElementException();
        }
        try {
            synchronized (zzijsVar) {
                this.zzc.zzd(this.zze);
                zzatjVarZzb = this.zzb.zzb(this.zzc, this);
                this.zze = this.zzc.zzc();
            }
            return zzatjVarZzb;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }
}
