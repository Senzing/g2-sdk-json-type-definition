// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Text.Json.Serialization;

namespace Senzing
{
    public class CfgAttr
    {
        [JsonPropertyName("ADVANCED")]
        public string Advanced { get; set; }

        [JsonPropertyName("ATTR_CLASS")]
        public string AttrClass { get; set; }

        [JsonPropertyName("ATTR_CODE")]
        public string AttrCode { get; set; }

        [JsonPropertyName("ATTR_ID")]
        public int AttrId { get; set; }

        [JsonPropertyName("DEFAULT_VALUE")]
        public string DefaultValue { get; set; }

        [JsonPropertyName("FELEM_CODE")]
        public string FelemCode { get; set; }

        [JsonPropertyName("FELEM_REQ")]
        public string FelemReq { get; set; }

        [JsonPropertyName("FTYPE_CODE")]
        public string FtypeCode { get; set; }

        [JsonPropertyName("INTERNAL")]
        public string Internal { get; set; }
    }
}
