package com.nttdata.data.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\bL\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u009b\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0015\u00a2\u0006\u0002\u0010\u001cJ\t\u0010O\u001a\u00020\u0003H\u00c6\u0003J\t\u0010P\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Q\u001a\u00020\u0003H\u00c6\u0003J\t\u0010R\u001a\u00020\u0003H\u00c6\u0003J\t\u0010S\u001a\u00020\u0003H\u00c6\u0003J\t\u0010T\u001a\u00020\u0003H\u00c6\u0003J\t\u0010U\u001a\u00020\u0003H\u00c6\u0003J\t\u0010V\u001a\u00020\u0003H\u00c6\u0003J\t\u0010W\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010X\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015H\u00c6\u0003J\u0011\u0010Y\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015H\u00c6\u0003J\t\u0010Z\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010[\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015H\u00c6\u0003J\u0011\u0010\\\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015H\u00c6\u0003J\u0011\u0010]\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015H\u00c6\u0003J\u0011\u0010^\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0015H\u00c6\u0003J\t\u0010_\u001a\u00020\u0003H\u00c6\u0003J\t\u0010`\u001a\u00020\u0003H\u00c6\u0003J\t\u0010a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010e\u001a\u00020\u0003H\u00c6\u0003J\u009f\u0002\u0010f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00152\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00152\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00152\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00152\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00152\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0015H\u00c6\u0001J\u0013\u0010g\u001a\u00020h2\b\u0010i\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010j\u001a\u00020kH\u00d6\u0001J\t\u0010l\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R&\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010\u0010\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u001e\"\u0004\b(\u0010 R&\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R\u001e\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001e\"\u0004\b,\u0010 R\u001e\u0010\u0012\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001e\"\u0004\b.\u0010 R\u001e\u0010\u0011\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001e\"\u0004\b0\u0010 R&\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010$\"\u0004\b2\u0010&R&\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010$\"\u0004\b4\u0010&R&\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010$\"\u0004\b6\u0010&R\u001e\u0010\u000f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001e\"\u0004\b8\u0010 R&\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010$\"\u0004\b:\u0010&R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u001e\"\u0004\b<\u0010 R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u001e\"\u0004\b>\u0010 R\u001e\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u001e\"\u0004\b@\u0010 R\u001e\u0010\u0013\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u001e\"\u0004\bB\u0010 R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u001e\"\u0004\bD\u0010 R\u001e\u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u001e\"\u0004\bF\u0010 R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u001e\"\u0004\bH\u0010 R\u001e\u0010\u000e\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u001e\"\u0004\bJ\u0010 R\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\u001e\"\u0004\bL\u0010 R\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u001e\"\u0004\bN\u0010 \u00a8\u0006m"}, d2 = {"Lcom/nttdata/data/response/LiveNewsResponse;", "", "slug_name", "", "section", "subsection", "title", "abstract", "uri", "url", "byline", "thumbnail_standard", "item_type", "source", "updated_date", "published_date", "first_published_date", "material_type_facet", "kicker", "subheadline", "des_facet", "", "org_facet", "per_facet", "geo_facet", "relatedUrls", "multimedia", "Lcom/nttdata/data/response/MultimediaResponse;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getAbstract", "()Ljava/lang/String;", "setAbstract", "(Ljava/lang/String;)V", "getByline", "setByline", "getDes_facet", "()Ljava/util/List;", "setDes_facet", "(Ljava/util/List;)V", "getFirst_published_date", "setFirst_published_date", "getGeo_facet", "setGeo_facet", "getItem_type", "setItem_type", "getKicker", "setKicker", "getMaterial_type_facet", "setMaterial_type_facet", "getMultimedia", "setMultimedia", "getOrg_facet", "setOrg_facet", "getPer_facet", "setPer_facet", "getPublished_date", "setPublished_date", "getRelatedUrls", "setRelatedUrls", "getSection", "setSection", "getSlug_name", "setSlug_name", "getSource", "setSource", "getSubheadline", "setSubheadline", "getSubsection", "setSubsection", "getThumbnail_standard", "setThumbnail_standard", "getTitle", "setTitle", "getUpdated_date", "setUpdated_date", "getUri", "setUri", "getUrl", "setUrl", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "data_debug"})
public final class LiveNewsResponse {
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "slug_name")
    private java.lang.String slug_name;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "section")
    private java.lang.String section;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "subsection")
    private java.lang.String subsection;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "title")
    private java.lang.String title;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "uri")
    private java.lang.String uri;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "url")
    private java.lang.String url;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "byline")
    private java.lang.String byline;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "thumbnail_standard")
    private java.lang.String thumbnail_standard;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "item_type")
    private java.lang.String item_type;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "source")
    private java.lang.String source;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "updated_date")
    private java.lang.String updated_date;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "published_date")
    private java.lang.String published_date;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "first_published_date")
    private java.lang.String first_published_date;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "material_type_facet")
    private java.lang.String material_type_facet;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "kicker")
    private java.lang.String kicker;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "subheadline")
    private java.lang.String subheadline;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "des_facet")
    private java.util.List<java.lang.String> des_facet;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "org_facet")
    private java.util.List<java.lang.String> org_facet;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "per_facet")
    private java.util.List<java.lang.String> per_facet;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "geo_facet")
    private java.util.List<java.lang.String> geo_facet;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "relatedUrls")
    private java.util.List<java.lang.String> relatedUrls;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "multimedia")
    private java.util.List<com.nttdata.data.response.MultimediaResponse> multimedia;
    
    @org.jetbrains.annotations.NotNull
    public final com.nttdata.data.response.LiveNewsResponse copy(@org.jetbrains.annotations.NotNull
    java.lang.String slug_name, @org.jetbrains.annotations.NotNull
    java.lang.String section, @org.jetbrains.annotations.NotNull
    java.lang.String subsection, @org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String p4_866449425, @org.jetbrains.annotations.NotNull
    java.lang.String uri, @org.jetbrains.annotations.NotNull
    java.lang.String url, @org.jetbrains.annotations.NotNull
    java.lang.String byline, @org.jetbrains.annotations.NotNull
    java.lang.String thumbnail_standard, @org.jetbrains.annotations.NotNull
    java.lang.String item_type, @org.jetbrains.annotations.NotNull
    java.lang.String source, @org.jetbrains.annotations.NotNull
    java.lang.String updated_date, @org.jetbrains.annotations.NotNull
    java.lang.String published_date, @org.jetbrains.annotations.NotNull
    java.lang.String first_published_date, @org.jetbrains.annotations.NotNull
    java.lang.String material_type_facet, @org.jetbrains.annotations.NotNull
    java.lang.String kicker, @org.jetbrains.annotations.NotNull
    java.lang.String subheadline, @org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> des_facet, @org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> org_facet, @org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> per_facet, @org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> geo_facet, @org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> relatedUrls, @org.jetbrains.annotations.Nullable
    java.util.List<com.nttdata.data.response.MultimediaResponse> multimedia) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public LiveNewsResponse() {
        super();
    }
    
    public LiveNewsResponse(@org.jetbrains.annotations.NotNull
    java.lang.String slug_name, @org.jetbrains.annotations.NotNull
    java.lang.String section, @org.jetbrains.annotations.NotNull
    java.lang.String subsection, @org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String p4_866449425, @org.jetbrains.annotations.NotNull
    java.lang.String uri, @org.jetbrains.annotations.NotNull
    java.lang.String url, @org.jetbrains.annotations.NotNull
    java.lang.String byline, @org.jetbrains.annotations.NotNull
    java.lang.String thumbnail_standard, @org.jetbrains.annotations.NotNull
    java.lang.String item_type, @org.jetbrains.annotations.NotNull
    java.lang.String source, @org.jetbrains.annotations.NotNull
    java.lang.String updated_date, @org.jetbrains.annotations.NotNull
    java.lang.String published_date, @org.jetbrains.annotations.NotNull
    java.lang.String first_published_date, @org.jetbrains.annotations.NotNull
    java.lang.String material_type_facet, @org.jetbrains.annotations.NotNull
    java.lang.String kicker, @org.jetbrains.annotations.NotNull
    java.lang.String subheadline, @org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> des_facet, @org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> org_facet, @org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> per_facet, @org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> geo_facet, @org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> relatedUrls, @org.jetbrains.annotations.Nullable
    java.util.List<com.nttdata.data.response.MultimediaResponse> multimedia) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSlug_name() {
        return null;
    }
    
    public final void setSlug_name(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSection() {
        return null;
    }
    
    public final void setSection(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSubsection() {
        return null;
    }
    
    public final void setSubsection(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAbstract() {
        return null;
    }
    
    public final void setAbstract(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUri() {
        return null;
    }
    
    public final void setUri(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUrl() {
        return null;
    }
    
    public final void setUrl(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getByline() {
        return null;
    }
    
    public final void setByline(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getThumbnail_standard() {
        return null;
    }
    
    public final void setThumbnail_standard(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getItem_type() {
        return null;
    }
    
    public final void setItem_type(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSource() {
        return null;
    }
    
    public final void setSource(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUpdated_date() {
        return null;
    }
    
    public final void setUpdated_date(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPublished_date() {
        return null;
    }
    
    public final void setPublished_date(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFirst_published_date() {
        return null;
    }
    
    public final void setFirst_published_date(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMaterial_type_facet() {
        return null;
    }
    
    public final void setMaterial_type_facet(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getKicker() {
        return null;
    }
    
    public final void setKicker(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSubheadline() {
        return null;
    }
    
    public final void setSubheadline(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> getDes_facet() {
        return null;
    }
    
    public final void setDes_facet(@org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> getOrg_facet() {
        return null;
    }
    
    public final void setOrg_facet(@org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> getPer_facet() {
        return null;
    }
    
    public final void setPer_facet(@org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> getGeo_facet() {
        return null;
    }
    
    public final void setGeo_facet(@org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> getRelatedUrls() {
        return null;
    }
    
    public final void setRelatedUrls(@org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.nttdata.data.response.MultimediaResponse> component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.nttdata.data.response.MultimediaResponse> getMultimedia() {
        return null;
    }
    
    public final void setMultimedia(@org.jetbrains.annotations.Nullable
    java.util.List<com.nttdata.data.response.MultimediaResponse> p0) {
    }
}