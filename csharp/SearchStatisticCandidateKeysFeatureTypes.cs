// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Text.Json.Serialization;

namespace Senzing
{
    public class SearchStatisticCandidateKeysFeatureTypes
    {
        [JsonPropertyName("FOUND")]
        public int Found { get; set; }

        [JsonPropertyName("FTYPE_CODE")]
        public string FtypeCode { get; set; }

        [JsonPropertyName("GENERIC")]
        public int Generic { get; set; }

        [JsonPropertyName("NOT_FOUND")]
        public int NotFound { get; set; }
    }
}
