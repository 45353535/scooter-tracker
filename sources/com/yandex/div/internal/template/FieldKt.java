package com.yandex.div.internal.template;

import com.yandex.div.internal.template.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005*@\u0010\n\u001a\u0004\b\u0000\u0010\u0000\"\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\u00062\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\u0006¨\u0006\u000b"}, d2 = {"T", "Lcom/yandex/div/internal/template/Field;", "", "overridable", "clone", "(Lcom/yandex/div/internal/template/Field;Z)Lcom/yandex/div/internal/template/Field;", "Lkotlin/Function3;", "", "Lorg/json/JSONObject;", "Lcom/yandex/div/json/ParsingEnvironment;", "Reader", "div-data_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class FieldKt {
    @NotNull
    public static final <T> Field<T> clone(@Nullable Field<T> field, boolean z10) {
        if (field == null || Intrinsics.areEqual(field, Field.Null.INSTANCE) || Intrinsics.areEqual(field, Field.Placeholder.INSTANCE)) {
            return Field.INSTANCE.nullField(z10);
        }
        if (field instanceof Field.Value) {
            return new Field.Value(z10, ((Field.Value) field).value);
        }
        if (field instanceof Field.Reference) {
            return new Field.Reference(z10, ((Field.Reference) field).reference);
        }
        throw new IllegalStateException("Unknown field type");
    }
}
