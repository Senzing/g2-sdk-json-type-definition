// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Text.Json.Serialization;

namespace Senzing
{
    public class ResolvedEntityAndMatchInfo
    {
        [JsonPropertyName("ENTITY")]
        public ResolvedEntityAndMatchInfoEntity Entity { get; set; }

        [JsonPropertyName("MATCH_INFO")]
        public MatchInfo MatchInfo { get; set; }
    }
}
