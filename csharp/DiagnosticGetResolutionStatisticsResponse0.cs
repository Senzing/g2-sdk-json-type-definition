// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Senzing
{
    public class DiagnosticGetResolutionStatisticsResponse0
    {
        [JsonPropertyName("ERRULE_CODE")]
        public string ErruleCode { get; set; }

        [JsonPropertyName("ERRULE_ID")]
        public int ErruleId { get; set; }

        [JsonPropertyName("IS_AMBIGUOUS")]
        public string IsAmbiguous { get; set; }

        [JsonPropertyName("MATCH_KEY")]
        public string MatchKey { get; set; }

        [JsonPropertyName("MATCH_LEVEL")]
        public int MatchLevel { get; set; }

        [JsonPropertyName("MAX_RES_ENT_ID")]
        public int MaxResEntId { get; set; }

        [JsonPropertyName("MAX_RES_REL_ID")]
        public int MaxResRelId { get; set; }

        [JsonPropertyName("MIN_RES_ENT_ID")]
        public int MinResEntId { get; set; }

        [JsonPropertyName("MIN_RES_REL_ID")]
        public int MinResRelId { get; set; }

        [JsonPropertyName("RAW_MATCH_KEYS")]
        public IList<DiagnosticGetResolutionStatisticsResponseRawMatchKeys> RawMatchKeys { get; set; }

        [JsonPropertyName("RECORD_COUNT")]
        public int RecordCount { get; set; }
    }
}
