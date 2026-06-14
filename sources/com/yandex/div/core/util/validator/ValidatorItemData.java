package com.yandex.div.core.util.validator;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/yandex/div/core/util/validator/ValidatorItemData;", "", "validator", "Lcom/yandex/div/core/util/validator/BaseValidator;", "variableName", "", "labelId", "(Lcom/yandex/div/core/util/validator/BaseValidator;Ljava/lang/String;Ljava/lang/String;)V", "getLabelId", "()Ljava/lang/String;", "getValidator", "()Lcom/yandex/div/core/util/validator/BaseValidator;", "getVariableName", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ValidatorItemData {

    @NotNull
    private final String labelId;

    @NotNull
    private final BaseValidator validator;

    @NotNull
    private final String variableName;

    public ValidatorItemData(@NotNull BaseValidator baseValidator, @NotNull String str, @NotNull String str2) {
        this.validator = baseValidator;
        this.variableName = str;
        this.labelId = str2;
    }

    @NotNull
    public final String getLabelId() {
        return this.labelId;
    }

    @NotNull
    public final BaseValidator getValidator() {
        return this.validator;
    }

    @NotNull
    public final String getVariableName() {
        return this.variableName;
    }
}
