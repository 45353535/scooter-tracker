package org.bidon.sdk.utils.json;

import com.ironsource.C4424m2;
import com.unity3d.services.core.fid.Constants;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;
import kotlin.reflect.KClass;
import org.bidon.sdk.auction.models.AdUnit;
import org.bidon.sdk.auction.models.AdUnitParser;
import org.bidon.sdk.auction.models.AuctionResponse;
import org.bidon.sdk.auction.models.AuctionResponseParser;
import org.bidon.sdk.config.models.ConfigResponse;
import org.bidon.sdk.config.models.ConfigResponseParser;
import org.bidon.sdk.utils.networking.BaseResponse;
import org.bidon.sdk.utils.networking.BaseResponseErrorParser;
import org.bidon.sdk.utils.networking.BaseResponseParser;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\b\u001a\u0004\u0018\u0001H\t\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\u00012\u0006\u0010\n\u001a\u00020\u000bH\u0086\b¢\u0006\u0002\u0010\fJ'\u0010\r\u001a\n\u0012\u0004\u0012\u0002H\t\u0018\u00010\u000e\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0086\bJ+\u0010\u0011\u001a\u00020\u0000\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\u00012\u0014\b\b\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\t0\u00140\u0013H\u0082\bR\"\u0010\u0004\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lorg/bidon/sdk/utils/json/JsonParsers;", "", "<init>", "()V", "parsersFactories", "", "Lkotlin/reflect/KClass;", "Lorg/bidon/sdk/utils/json/JsonParsers$ParserFactory;", "parseOrNull", "T", "jsonString", "", "(Ljava/lang/String;)Ljava/lang/Object;", "parseList", "", "jsonArray", "Lorg/json/JSONArray;", "addParser", "parser", "Lkotlin/Function0;", "Lorg/bidon/sdk/utils/json/JsonParser;", "ParserFactory", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JsonParsers {

    @NotNull
    public static final JsonParsers INSTANCE = new JsonParsers();

    @NotNull
    private static final Map<KClass<?>, ParserFactory<?>> parsersFactories;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lorg/bidon/sdk/utils/json/JsonParsers$ParserFactory;", "T", "", "factory", "Lkotlin/Function0;", "Lorg/bidon/sdk/utils/json/JsonParser;", "<init>", "(Lkotlin/jvm/functions/Function0;)V", C4424m2.f43617p, Constants.GET_INSTANCE, "()Lorg/bidon/sdk/utils/json/JsonParser;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ParserFactory<T> {

        @NotNull
        private final Function0<JsonParser<T>> factory;

        /* JADX WARN: Multi-variable type inference failed */
        public ParserFactory(@NotNull Function0<? extends JsonParser<T>> factory) {
            Intrinsics.checkNotNullParameter(factory, "factory");
            this.factory = factory;
        }

        @NotNull
        public final JsonParser<T> getInstance() {
            return this.factory.invoke();
        }
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        parsersFactories = linkedHashMap;
        linkedHashMap.put(v0.b(BaseResponse.class), new ParserFactory(new Function0() { // from class: org.bidon.sdk.utils.json.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JsonParsers._init_$lambda$0();
            }
        }));
        linkedHashMap.put(v0.b(BaseResponse.Error.class), new ParserFactory(new Function0() { // from class: org.bidon.sdk.utils.json.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JsonParsers._init_$lambda$1();
            }
        }));
        linkedHashMap.put(v0.b(ConfigResponse.class), new ParserFactory(new Function0() { // from class: org.bidon.sdk.utils.json.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JsonParsers._init_$lambda$2();
            }
        }));
        linkedHashMap.put(v0.b(AuctionResponse.class), new ParserFactory(new Function0() { // from class: org.bidon.sdk.utils.json.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JsonParsers._init_$lambda$3();
            }
        }));
        linkedHashMap.put(v0.b(AdUnit.class), new ParserFactory(new Function0() { // from class: org.bidon.sdk.utils.json.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JsonParsers._init_$lambda$4();
            }
        }));
    }

    private JsonParsers() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonParser _init_$lambda$0() {
        return new BaseResponseParser();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonParser _init_$lambda$1() {
        return new BaseResponseErrorParser();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonParser _init_$lambda$2() {
        return new ConfigResponseParser();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonParser _init_$lambda$3() {
        return new AuctionResponseParser();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonParser _init_$lambda$4() {
        return new AdUnitParser();
    }

    private final /* synthetic */ <T> JsonParsers addParser(Function0<? extends JsonParser<T>> parser) {
        Map<KClass<?>, ParserFactory<?>> map = parsersFactories;
        Intrinsics.reifiedOperationMarker(4, "T");
        map.put(v0.b(Object.class), new ParserFactory<>(parser));
        return this;
    }

    public final /* synthetic */ <T> List<T> parseList(JSONArray jsonArray) {
        if (jsonArray == null) {
            return null;
        }
        Map map = parsersFactories;
        Intrinsics.reifiedOperationMarker(4, "T");
        Object obj = map.get(v0.b(Object.class));
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.bidon.sdk.utils.json.JsonParsers.ParserFactory<T of org.bidon.sdk.utils.json.JsonParsers.parseList>");
        JsonParser<T> parserFactory = ((ParserFactory) obj).getInstance();
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        List list = listCreateListBuilder;
        int length = jsonArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            String string = jsonArray.getJSONObject(i10).toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            T orNull = parserFactory.parseOrNull(string);
            if (orNull != null) {
                list.add(orNull);
            }
        }
        return CollectionsKt.build(listCreateListBuilder);
    }

    public final /* synthetic */ <T> T parseOrNull(String jsonString) {
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        Map map = parsersFactories;
        Intrinsics.reifiedOperationMarker(4, "T");
        Object obj = map.get(v0.b(Object.class));
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.bidon.sdk.utils.json.JsonParsers.ParserFactory<T of org.bidon.sdk.utils.json.JsonParsers.parseOrNull>");
        return ((ParserFactory) obj).getInstance().parseOrNull(jsonString);
    }
}
