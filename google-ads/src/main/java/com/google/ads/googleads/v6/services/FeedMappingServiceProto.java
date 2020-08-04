// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/services/feed_mapping_service.proto

package com.google.ads.googleads.v6.services;

public final class FeedMappingServiceProto {
  private FeedMappingServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_GetFeedMappingRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_GetFeedMappingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_MutateFeedMappingsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_MutateFeedMappingsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_FeedMappingOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_FeedMappingOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_MutateFeedMappingsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_MutateFeedMappingsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_MutateFeedMappingResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_MutateFeedMappingResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;google/ads/googleads/v6/services/feed_" +
      "mapping_service.proto\022 google.ads.google" +
      "ads.v6.services\0324google/ads/googleads/v6" +
      "/resources/feed_mapping.proto\032\034google/ap" +
      "i/annotations.proto\032\027google/api/client.p" +
      "roto\032\037google/api/field_behavior.proto\032\031g" +
      "oogle/api/resource.proto\032\027google/rpc/sta" +
      "tus.proto\"\\\n\025GetFeedMappingRequest\022C\n\rre" +
      "source_name\030\001 \001(\tB,\340A\002\372A&\n$googleads.goo" +
      "gleapis.com/FeedMapping\"\266\001\n\031MutateFeedMa" +
      "ppingsRequest\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022" +
      "O\n\noperations\030\002 \003(\01326.google.ads.googlea" +
      "ds.v6.services.FeedMappingOperationB\003\340A\002" +
      "\022\027\n\017partial_failure\030\003 \001(\010\022\025\n\rvalidate_on" +
      "ly\030\004 \001(\010\"w\n\024FeedMappingOperation\022@\n\006crea" +
      "te\030\001 \001(\0132..google.ads.googleads.v6.resou" +
      "rces.FeedMappingH\000\022\020\n\006remove\030\003 \001(\tH\000B\013\n\t" +
      "operation\"\233\001\n\032MutateFeedMappingsResponse" +
      "\0221\n\025partial_failure_error\030\003 \001(\0132\022.google" +
      ".rpc.Status\022J\n\007results\030\002 \003(\01329.google.ad" +
      "s.googleads.v6.services.MutateFeedMappin" +
      "gResult\"0\n\027MutateFeedMappingResult\022\025\n\rre" +
      "source_name\030\001 \001(\t2\336\003\n\022FeedMappingService" +
      "\022\301\001\n\016GetFeedMapping\0227.google.ads.googlea" +
      "ds.v6.services.GetFeedMappingRequest\032..g" +
      "oogle.ads.googleads.v6.resources.FeedMap" +
      "ping\"F\202\323\344\223\0020\022./v6/{resource_name=custome" +
      "rs/*/feedMappings/*}\332A\rresource_name\022\346\001\n" +
      "\022MutateFeedMappings\022;.google.ads.googlea" +
      "ds.v6.services.MutateFeedMappingsRequest" +
      "\032<.google.ads.googleads.v6.services.Muta" +
      "teFeedMappingsResponse\"U\202\323\344\223\0026\"1/v6/cust" +
      "omers/{customer_id=*}/feedMappings:mutat" +
      "e:\001*\332A\026customer_id,operations\032\033\312A\030google" +
      "ads.googleapis.comB\376\001\n$com.google.ads.go" +
      "ogleads.v6.servicesB\027FeedMappingServiceP" +
      "rotoP\001ZHgoogle.golang.org/genproto/googl" +
      "eapis/ads/googleads/v6/services;services" +
      "\242\002\003GAA\252\002 Google.Ads.GoogleAds.V6.Service" +
      "s\312\002 Google\\Ads\\GoogleAds\\V6\\Services\352\002$G" +
      "oogle::Ads::GoogleAds::V6::Servicesb\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v6.resources.FeedMappingProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v6_services_GetFeedMappingRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v6_services_GetFeedMappingRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_GetFeedMappingRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v6_services_MutateFeedMappingsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v6_services_MutateFeedMappingsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_MutateFeedMappingsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v6_services_FeedMappingOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v6_services_FeedMappingOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_FeedMappingOperation_descriptor,
        new java.lang.String[] { "Create", "Remove", "Operation", });
    internal_static_google_ads_googleads_v6_services_MutateFeedMappingsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v6_services_MutateFeedMappingsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_MutateFeedMappingsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v6_services_MutateFeedMappingResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v6_services_MutateFeedMappingResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_MutateFeedMappingResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v6.resources.FeedMappingProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}