package com.yandex.div.evaluable;

import androidx.exifinterface.media.ExifInterface;
import com.taurusx.tax.f.y;
import com.taurusx.tax.utils.webview.TaxBrowserActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, d2 = {"Lcom/yandex/div/evaluable/EvaluableType;", "", "typeName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getTypeName$div_evaluable", "()Ljava/lang/String;", "toString", "INTEGER", "NUMBER", "BOOLEAN", "STRING", "DATETIME", "COLOR", TaxBrowserActivity.f66923n, "DICT", "ARRAY", y.f66058y, "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum EvaluableType {
    INTEGER("Integer"),
    NUMBER("Number"),
    BOOLEAN("Boolean"),
    STRING("String"),
    DATETIME(ExifInterface.TAG_DATETIME),
    COLOR("Color"),
    URL("Url"),
    DICT("Dict"),
    ARRAY("Array");


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String typeName;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/evaluable/EvaluableType$Companion;", "", "<init>", "()V", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    EvaluableType(String str) {
        this.typeName = str;
    }

    @NotNull
    /* JADX INFO: renamed from: getTypeName$div_evaluable, reason: from getter */
    public final String getTypeName() {
        return this.typeName;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.typeName;
    }
}
