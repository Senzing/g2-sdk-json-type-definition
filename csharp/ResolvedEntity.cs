// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Text.Json.Serialization;

namespace Senzing
{
    public class ResolvedEntity
    {
        [JsonPropertyName("ENTITY_ID")]
        public int EntityId { get; set; }

        [JsonPropertyName("ENTITY_NAME")]
        public string EntityName { get; set; }

        [JsonPropertyName("ERRULE_CODE")]
        public string ErruleCode { get; set; }

        [JsonPropertyName("FEATURES")]
        public Features Features { get; set; }

        [JsonPropertyName("IS_AMBIGUOUS")]
        public int IsAmbiguous { get; set; }

        [JsonPropertyName("IS_DISCLOSED")]
        public int IsDisclosed { get; set; }

        [JsonPropertyName("LAST_SEEN_DT")]
        public string LastSeenDt { get; set; }

        [JsonPropertyName("MATCH_KEY")]
        public string MatchKey { get; set; }

        [JsonPropertyName("MATCH_LEVEL")]
        public int MatchLevel { get; set; }

        [JsonPropertyName("MATCH_LEVEL_CODE")]
        public string MatchLevelCode { get; set; }

        [JsonPropertyName("RECORDS")]
        public Records Records { get; set; }

        [JsonPropertyName("RECORD_SUMMARY")]
        public RecordSummary RecordSummary { get; set; }
    }
}
