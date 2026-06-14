package com.startapp.sdk.adsbase.remoteconfig;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.startapp.json.TypeParser;
import com.startapp.sdk.internal.si;
import com.startapp.sdk.internal.vi;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class WeightedChoice implements Serializable {
    private static final long serialVersionUID = 8011948312180032586L;

    @NonNull
    private final String[] keys;

    @NonNull
    private final int[] weights;

    @Keep
    public static class Parser implements TypeParser<WeightedChoice> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.startapp.json.TypeParser
        @Nullable
        public WeightedChoice parse(@NonNull Class<WeightedChoice> cls, @Nullable Object obj) {
            if (obj instanceof String) {
                return new WeightedChoice(new String[]{(String) obj}, new int[]{1});
            }
            if (!(obj instanceof JSONObject)) {
                return null;
            }
            JSONObject jSONObject = (JSONObject) obj;
            int length = jSONObject.length();
            String[] strArr = new String[length];
            int[] iArr = new int[length];
            Iterator<String> itKeys = jSONObject.keys();
            int i10 = 0;
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                strArr[i10] = next;
                iArr[i10] = jSONObject.optInt(next, 0);
                i10++;
            }
            return new WeightedChoice(strArr, iArr);
        }
    }

    public WeightedChoice(String[] strArr, int[] iArr) {
        this.keys = strArr;
        this.weights = iArr;
    }

    public final String a() {
        int[] iArr = this.weights;
        WeakHashMap weakHashMap = vi.f65408a;
        int length = iArr.length;
        si siVar = vi.f65412e;
        int[] iArr2 = new int[length];
        int[] iArr3 = new int[length];
        int i10 = 0;
        int i11 = -1;
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = iArr[i12];
            if (i13 > 0) {
                i10 += i13;
                i11++;
                iArr2[i11] = i10 - 1;
                iArr3[i11] = i12;
            }
        }
        for (int i14 = i11 + 1; i14 < length; i14++) {
            iArr2[i14] = ((i10 + i14) - i11) - 1;
            iArr3[i14] = -1;
        }
        siVar.getClass();
        Random random = vi.f65411d;
        if (random == null) {
            random = new Random();
            vi.f65411d = random;
        }
        int iBinarySearch = Arrays.binarySearch(iArr2, random.nextInt(i10));
        if (iBinarySearch < 0) {
            iBinarySearch = ~iBinarySearch;
        }
        int i15 = iArr3[iBinarySearch];
        if (i15 < 0) {
            return null;
        }
        String[] strArr = this.keys;
        if (i15 < strArr.length) {
            return strArr[i15];
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            WeightedChoice weightedChoice = (WeightedChoice) obj;
            if (Arrays.equals(this.keys, weightedChoice.keys) && Arrays.equals(this.weights, weightedChoice.weights)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.keys, this.weights};
        WeakHashMap weakHashMap = vi.f65408a;
        return Arrays.deepHashCode(objArr);
    }
}
