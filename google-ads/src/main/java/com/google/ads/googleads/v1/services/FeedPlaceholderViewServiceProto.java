// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/services/feed_placeholder_view_service.proto

package com.google.ads.googleads.v1.services;

public final class FeedPlaceholderViewServiceProto {
  private FeedPlaceholderViewServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_GetFeedPlaceholderViewRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_GetFeedPlaceholderViewRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nDgoogle/ads/googleads/v1/services/feed_" +
      "placeholder_view_service.proto\022 google.a" +
      "ds.googleads.v1.services\032=google/ads/goo" +
      "gleads/v1/resources/feed_placeholder_vie" +
      "w.proto\032\034google/api/annotations.proto\"6\n" +
      "\035GetFeedPlaceholderViewRequest\022\025\n\rresour" +
      "ce_name\030\001 \001(\t2\360\001\n\032FeedPlaceholderViewSer" +
      "vice\022\321\001\n\026GetFeedPlaceholderView\022?.google" +
      ".ads.googleads.v1.services.GetFeedPlaceh" +
      "olderViewRequest\0326.google.ads.googleads." +
      "v1.resources.FeedPlaceholderView\">\202\323\344\223\0028" +
      "\0226/v1/{resource_name=customers/*/feedPla" +
      "ceholderViews/*}B\206\002\n$com.google.ads.goog" +
      "leads.v1.servicesB\037FeedPlaceholderViewSe" +
      "rviceProtoP\001ZHgoogle.golang.org/genproto" +
      "/googleapis/ads/googleads/v1/services;se" +
      "rvices\242\002\003GAA\252\002 Google.Ads.GoogleAds.V1.S" +
      "ervices\312\002 Google\\Ads\\GoogleAds\\V1\\Servic" +
      "es\352\002$Google::Ads::GoogleAds::V1::Service" +
      "sb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v1.resources.FeedPlaceholderViewProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v1_services_GetFeedPlaceholderViewRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_services_GetFeedPlaceholderViewRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_GetFeedPlaceholderViewRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v1.resources.FeedPlaceholderViewProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
