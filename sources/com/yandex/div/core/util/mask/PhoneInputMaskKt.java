package com.yandex.div.core.util.mask;

import androidx.webkit.ProxyConfig;
import com.yandex.div.core.util.mask.BaseInputMask;
import java.util.List;
import k8.bz;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\" \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0018\u0010\u000e\u001a\u00020\u000b*\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"", "Lcom/yandex/div/core/util/mask/BaseInputMask$MaskKey;", "DEFAULT_DECODING_MASK_KEY", "Ljava/util/List;", "getDEFAULT_DECODING_MASK_KEY", "()Ljava/util/List;", "Lcom/yandex/div/core/util/mask/BaseInputMask$MaskData;", "DEFAULT_MASK_DATA", "Lcom/yandex/div/core/util/mask/BaseInputMask$MaskData;", "getDEFAULT_MASK_DATA", "()Lcom/yandex/div/core/util/mask/BaseInputMask$MaskData;", "", "getPhoneMaskPattern", "(Ljava/lang/String;)Ljava/lang/String;", "phoneMaskPattern", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class PhoneInputMaskKt {

    @NotNull
    private static final List<BaseInputMask.MaskKey> DEFAULT_DECODING_MASK_KEY;

    @NotNull
    private static final BaseInputMask.MaskData DEFAULT_MASK_DATA;

    static {
        List<BaseInputMask.MaskKey> listListOf = CollectionsKt.listOf(new BaseInputMask.MaskKey('0', "\\d", '_'));
        DEFAULT_DECODING_MASK_KEY = listListOf;
        DEFAULT_MASK_DATA = new BaseInputMask.MaskData(getPhoneMaskPattern(""), listListOf, false);
    }

    @NotNull
    public static final List<BaseInputMask.MaskKey> getDEFAULT_DECODING_MASK_KEY() {
        return DEFAULT_DECODING_MASK_KEY;
    }

    @NotNull
    public static final BaseInputMask.MaskData getDEFAULT_MASK_DATA() {
        return DEFAULT_MASK_DATA;
    }

    @NotNull
    public static final String getPhoneMaskPattern(@NotNull String str) throws JSONException {
        if (StringsKt.y0(str)) {
            return "000000000000000";
        }
        JSONObject jSONObject = bz.f86600b;
        int i10 = 0;
        while (true) {
            if (jSONObject.has("value")) {
                break;
            }
            int length = str.length();
            String str2 = ProxyConfig.MATCH_ALL_SCHEMES;
            if (i10 >= length) {
                Object obj = jSONObject.get(ProxyConfig.MATCH_ALL_SCHEMES);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
                jSONObject = (JSONObject) obj;
                break;
            }
            int i11 = i10 + 1;
            String strValueOf = String.valueOf(str.charAt(i10));
            if (jSONObject.has(strValueOf)) {
                str2 = strValueOf;
            }
            Object obj2 = jSONObject.get(str2);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
            jSONObject = (JSONObject) obj2;
            i10 = i11;
        }
        return jSONObject.getString("value") + "00";
    }
}
