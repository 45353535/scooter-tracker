package com.yandex.div.internal.parser;

import android.net.Uri;
import androidx.core.view.ViewCompat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\"\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00018\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00018\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00018\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00018\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"TYPE_HELPER_BOOLEAN", "Lcom/yandex/div/internal/parser/TypeHelper;", "", "TYPE_HELPER_COLOR", "", "TYPE_HELPER_DICT", "Lorg/json/JSONObject;", "TYPE_HELPER_DOUBLE", "", "TYPE_HELPER_INT", "", "TYPE_HELPER_JSON_ARRAY", "Lorg/json/JSONArray;", "TYPE_HELPER_STRING", "", "TYPE_HELPER_URI", "Landroid/net/Uri;", "div-data_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class TypeHelpersKt {

    @NotNull
    public static final TypeHelper<Boolean> TYPE_HELPER_BOOLEAN = new TypeHelper<Boolean>() { // from class: com.yandex.div.internal.parser.TypeHelpersKt$TYPE_HELPER_BOOLEAN$1
        private final boolean typeDefault;

        @Override // com.yandex.div.internal.parser.TypeHelper
        public boolean isTypeValid(@NotNull Object value) {
            return value instanceof Boolean;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.yandex.div.internal.parser.TypeHelper
        @NotNull
        public Boolean getTypeDefault() {
            return Boolean.valueOf(this.typeDefault);
        }
    };

    @NotNull
    public static final TypeHelper<Long> TYPE_HELPER_INT = new TypeHelper<Long>() { // from class: com.yandex.div.internal.parser.TypeHelpersKt$TYPE_HELPER_INT$1
        private final long typeDefault;

        @Override // com.yandex.div.internal.parser.TypeHelper
        public boolean isTypeValid(@NotNull Object value) {
            return value instanceof Long;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.yandex.div.internal.parser.TypeHelper
        @NotNull
        public Long getTypeDefault() {
            return Long.valueOf(this.typeDefault);
        }
    };

    @NotNull
    public static final TypeHelper<String> TYPE_HELPER_STRING = new TypeHelper<String>() { // from class: com.yandex.div.internal.parser.TypeHelpersKt$TYPE_HELPER_STRING$1

        @NotNull
        private final String typeDefault = "";

        @Override // com.yandex.div.internal.parser.TypeHelper
        public boolean isTypeValid(@NotNull Object value) {
            return value instanceof String;
        }

        @Override // com.yandex.div.internal.parser.TypeHelper
        @NotNull
        public String getTypeDefault() {
            return this.typeDefault;
        }
    };

    @NotNull
    public static final TypeHelper<Double> TYPE_HELPER_DOUBLE = new TypeHelper<Double>() { // from class: com.yandex.div.internal.parser.TypeHelpersKt$TYPE_HELPER_DOUBLE$1
        private final double typeDefault;

        @Override // com.yandex.div.internal.parser.TypeHelper
        public boolean isTypeValid(@NotNull Object value) {
            return value instanceof Double;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.yandex.div.internal.parser.TypeHelper
        @NotNull
        public Double getTypeDefault() {
            return Double.valueOf(this.typeDefault);
        }
    };

    @NotNull
    public static final TypeHelper<Uri> TYPE_HELPER_URI = new TypeHelper<Uri>() { // from class: com.yandex.div.internal.parser.TypeHelpersKt$TYPE_HELPER_URI$1
        private final Uri typeDefault = Uri.EMPTY;

        @Override // com.yandex.div.internal.parser.TypeHelper
        public boolean isTypeValid(@NotNull Object value) {
            return value instanceof Uri;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.yandex.div.internal.parser.TypeHelper
        public Uri getTypeDefault() {
            return this.typeDefault;
        }
    };

    @NotNull
    public static final TypeHelper<Integer> TYPE_HELPER_COLOR = new TypeHelper<Integer>() { // from class: com.yandex.div.internal.parser.TypeHelpersKt$TYPE_HELPER_COLOR$1
        private final int typeDefault = ViewCompat.MEASURED_STATE_MASK;

        @Override // com.yandex.div.internal.parser.TypeHelper
        public boolean isTypeValid(@NotNull Object value) {
            return value instanceof Integer;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.yandex.div.internal.parser.TypeHelper
        @NotNull
        public Integer getTypeDefault() {
            return Integer.valueOf(this.typeDefault);
        }
    };

    @NotNull
    public static final TypeHelper<JSONArray> TYPE_HELPER_JSON_ARRAY = new TypeHelper<JSONArray>() { // from class: com.yandex.div.internal.parser.TypeHelpersKt$TYPE_HELPER_JSON_ARRAY$1

        @NotNull
        private final JSONArray typeDefault = new JSONArray();

        @Override // com.yandex.div.internal.parser.TypeHelper
        public boolean isTypeValid(@NotNull Object value) {
            return value instanceof JSONArray;
        }

        @Override // com.yandex.div.internal.parser.TypeHelper
        @NotNull
        public JSONArray getTypeDefault() {
            return this.typeDefault;
        }
    };

    @NotNull
    public static final TypeHelper<JSONObject> TYPE_HELPER_DICT = new TypeHelper<JSONObject>() { // from class: com.yandex.div.internal.parser.TypeHelpersKt$TYPE_HELPER_DICT$1

        @NotNull
        private final JSONObject typeDefault = new JSONObject();

        @Override // com.yandex.div.internal.parser.TypeHelper
        public boolean isTypeValid(@NotNull Object value) {
            return value instanceof JSONObject;
        }

        @Override // com.yandex.div.internal.parser.TypeHelper
        @NotNull
        public JSONObject getTypeDefault() {
            return this.typeDefault;
        }
    };
}
