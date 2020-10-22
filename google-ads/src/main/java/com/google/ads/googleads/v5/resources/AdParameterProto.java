// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/resources/ad_parameter.proto

package com.google.ads.googleads.v5.resources;

public final class AdParameterProto {
  private AdParameterProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_resources_AdParameter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_resources_AdParameter_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4google/ads/googleads/v5/resources/ad_p" +
      "arameter.proto\022!google.ads.googleads.v5." +
      "resources\032\037google/api/field_behavior.pro" +
      "to\032\031google/api/resource.proto\032\034google/ap" +
      "i/annotations.proto\"\201\003\n\013AdParameter\022C\n\rr" +
      "esource_name\030\001 \001(\tB,\340A\005\372A&\n$googleads.go" +
      "ogleapis.com/AdParameter\022R\n\022ad_group_cri" +
      "terion\030\005 \001(\tB1\340A\005\372A+\n)googleads.googleap" +
      "is.com/AdGroupCriterionH\000\210\001\001\022!\n\017paramete" +
      "r_index\030\006 \001(\003B\003\340A\005H\001\210\001\001\022\033\n\016insertion_tex" +
      "t\030\007 \001(\tH\002\210\001\001:[\352AX\n$googleads.googleapis." +
      "com/AdParameter\0220customers/{customer}/ad" +
      "Parameters/{ad_parameter}B\025\n\023_ad_group_c" +
      "riterionB\022\n\020_parameter_indexB\021\n\017_inserti" +
      "on_textB\375\001\n%com.google.ads.googleads.v5." +
      "resourcesB\020AdParameterProtoP\001ZJgoogle.go" +
      "lang.org/genproto/googleapis/ads/googlea" +
      "ds/v5/resources;resources\242\002\003GAA\252\002!Google" +
      ".Ads.GoogleAds.V5.Resources\312\002!Google\\Ads" +
      "\\GoogleAds\\V5\\Resources\352\002%Google::Ads::G" +
      "oogleAds::V5::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v5_resources_AdParameter_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v5_resources_AdParameter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_resources_AdParameter_descriptor,
        new java.lang.String[] { "ResourceName", "AdGroupCriterion", "ParameterIndex", "InsertionText", "AdGroupCriterion", "ParameterIndex", "InsertionText", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}