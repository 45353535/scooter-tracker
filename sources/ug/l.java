package ug;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface l {
    Class with() default KSerializer.class;
}
