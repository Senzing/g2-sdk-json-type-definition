// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Text.Json.Serialization;

namespace Senzing
{
    public class DiagnosticGetGenericFeaturesResponse0
    {
        [JsonPropertyName("CANDIDATE_CAP_REACHED")]
        public string CandidateCapReached { get; set; }

        [JsonPropertyName("ESTIMATED_COUNT")]
        public int EstimatedCount { get; set; }

        [JsonPropertyName("FEAT_DESC")]
        public string FeatDesc { get; set; }

        [JsonPropertyName("FTYPE_CODE")]
        public string FtypeCode { get; set; }

        [JsonPropertyName("LIB_FEAT_ID")]
        public int LibFeatId { get; set; }

        [JsonPropertyName("SCORING_CAP_REACHED")]
        public string ScoringCapReached { get; set; }
    }
}
