package com.google.android.gms.internal.maps;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes8.dex */
public interface zzaj extends IInterface {
    void zzA(@Nullable String str) throws RemoteException;

    void zzB(boolean z10) throws RemoteException;

    void zzC(float f10) throws RemoteException;

    void zzD() throws RemoteException;

    boolean zzE(zzaj zzajVar) throws RemoteException;

    boolean zzF() throws RemoteException;

    boolean zzG() throws RemoteException;

    boolean zzH() throws RemoteException;

    boolean zzI() throws RemoteException;

    float zzd() throws RemoteException;

    float zze() throws RemoteException;

    float zzf() throws RemoteException;

    int zzg() throws RemoteException;

    IObjectWrapper zzh() throws RemoteException;

    IObjectWrapper zzi() throws RemoteException;

    LatLng zzj() throws RemoteException;

    String zzk() throws RemoteException;

    String zzl() throws RemoteException;

    String zzm() throws RemoteException;

    void zzn() throws RemoteException;

    void zzo() throws RemoteException;

    void zzp(float f10) throws RemoteException;

    void zzq(float f10, float f11) throws RemoteException;

    void zzr(boolean z10) throws RemoteException;

    void zzs(boolean z10) throws RemoteException;

    void zzt(@Nullable IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzu(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzv(float f10, float f11) throws RemoteException;

    void zzw(LatLng latLng) throws RemoteException;

    void zzx(float f10) throws RemoteException;

    void zzy(@Nullable String str) throws RemoteException;

    void zzz(IObjectWrapper iObjectWrapper) throws RemoteException;
}
