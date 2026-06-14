package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.WorkerThread;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.ExceptionInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@WorkerThread
public final class AFd1uSDK implements AFd1zSDK {

    @NotNull
    private final AFc1gSDK getCurrencyIso4217Code;

    public AFd1uSDK(@NotNull AFc1gSDK aFc1gSDK) {
        Intrinsics.checkNotNullParameter(aFc1gSDK, "");
        this.getCurrencyIso4217Code = aFc1gSDK;
    }

    private final File getMonetizationNetwork() {
        Context context = this.getCurrencyIso4217Code.getRevenue;
        if (context == null) {
            return null;
        }
        File file = new File(context.getFilesDir(), "AFExceptionsCache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final int AFAdRevenueData() {
        Iterator<T> it = getMediationNetwork().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((ExceptionInfo) it.next()).counter;
        }
        return i10;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final boolean getCurrencyIso4217Code() {
        return getCurrencyIso4217Code(new String[0]);
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NotNull
    public final List<ExceptionInfo> getMediationNetwork() {
        List<ExceptionInfo> listEmptyList;
        File[] fileArrListFiles;
        ArrayList arrayList;
        File[] fileArrListFiles2;
        synchronized (this) {
            try {
                File monetizationNetwork = getMonetizationNetwork();
                listEmptyList = null;
                if (monetizationNetwork != null && (fileArrListFiles = monetizationNetwork.listFiles()) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (File file : fileArrListFiles) {
                        try {
                            fileArrListFiles2 = file.listFiles();
                        } catch (Throwable th2) {
                            AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "Could not get stored exceptions\n " + th2.getMessage(), false, 4, null);
                        }
                        if (fileArrListFiles2 != null) {
                            Intrinsics.checkNotNullExpressionValue(fileArrListFiles2, "");
                            arrayList = new ArrayList();
                            for (File file2 : fileArrListFiles2) {
                                ExceptionInfo.Companion companion = ExceptionInfo.INSTANCE;
                                Intrinsics.checkNotNullExpressionValue(file2, "");
                                ExceptionInfo currencyIso4217Code = ExceptionInfo.Companion.getCurrencyIso4217Code(uf.i.m(file2, null, 1, null));
                                if (currencyIso4217Code != null) {
                                    arrayList.add(currencyIso4217Code);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        if (arrayList != null) {
                            arrayList2.add(arrayList);
                        }
                    }
                    listEmptyList = CollectionsKt.flatten(arrayList2);
                }
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return listEmptyList;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @Nullable
    public final String getRevenue(@NotNull Throwable th2, @NotNull String str) {
        String str2;
        File file;
        Intrinsics.checkNotNullParameter(th2, "");
        Intrinsics.checkNotNullParameter(str, "");
        synchronized (this) {
            File monetizationNetwork = getMonetizationNetwork();
            str2 = null;
            if (monetizationNetwork != null) {
                file = new File(monetizationNetwork, "6.17.3");
                if (!file.exists()) {
                    file.mkdirs();
                }
            } else {
                file = null;
            }
            if (file != null) {
                try {
                    ExceptionInfo exceptionInfoAFAdRevenueData = AFd1pSDK.AFAdRevenueData(th2, str);
                    String str3 = exceptionInfoAFAdRevenueData.hashName;
                    File file2 = new File(file, str3);
                    if (file2.exists()) {
                        ExceptionInfo.Companion companion = ExceptionInfo.INSTANCE;
                        ExceptionInfo currencyIso4217Code = ExceptionInfo.Companion.getCurrencyIso4217Code(uf.i.m(file2, null, 1, null));
                        if (currencyIso4217Code != null) {
                            currencyIso4217Code.counter++;
                            exceptionInfoAFAdRevenueData = currencyIso4217Code;
                        }
                    }
                    uf.i.p(file2, exceptionInfoAFAdRevenueData.getMediationNetwork(), null, 2, null);
                    str2 = str3;
                } catch (Exception e10) {
                    AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "Could not cache exception\n " + e10.getMessage(), false, 4, null);
                }
            }
        }
        return str2;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final boolean getCurrencyIso4217Code(@NotNull String... strArr) {
        boolean zX;
        Intrinsics.checkNotNullParameter(strArr, "");
        synchronized (this) {
            try {
                File monetizationNetwork = getMonetizationNetwork();
                zX = true;
                if (monetizationNetwork != null) {
                    if (strArr.length == 0) {
                        AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "delete all exceptions", false, 4, null);
                        zX = uf.i.x(monetizationNetwork);
                    } else {
                        AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "delete all exceptions except for: " + ArraysKt.joinToString$default(strArr, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null), false, 4, null);
                        File[] fileArrListFiles = monetizationNetwork.listFiles();
                        if (fileArrListFiles != null) {
                            Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "");
                            ArrayList<File> arrayList = new ArrayList();
                            for (File file : fileArrListFiles) {
                                if (!ArraysKt.contains(strArr, file.getName())) {
                                    arrayList.add(file);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                            for (File file2 : arrayList) {
                                Intrinsics.checkNotNullExpressionValue(file2, "");
                                arrayList2.add(Boolean.valueOf(uf.i.x(file2)));
                            }
                            Set set = CollectionsKt.toSet(arrayList2);
                            if (set.isEmpty()) {
                                set = SetsKt.setOf(Boolean.TRUE);
                            }
                            Set set2 = set;
                            if (set2.size() != 1 || !((Boolean) CollectionsKt.first(set2)).booleanValue()) {
                                zX = false;
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zX;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final void getMediationNetwork(int i10, int i11) {
        File[] fileArrListFiles;
        synchronized (this) {
            try {
                File monetizationNetwork = getMonetizationNetwork();
                if (monetizationNetwork != null && (fileArrListFiles = monetizationNetwork.listFiles()) != null) {
                    Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "");
                    ArrayList<File> arrayList = new ArrayList();
                    for (File file : fileArrListFiles) {
                        String name = file.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "");
                        int mediationNetwork = AFk1zSDK.getMediationNetwork(name);
                        if (i10 > mediationNetwork || mediationNetwork > i11) {
                            arrayList.add(file);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                    for (File file2 : arrayList) {
                        Intrinsics.checkNotNullExpressionValue(file2, "");
                        arrayList2.add(Boolean.valueOf(uf.i.x(file2)));
                    }
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
