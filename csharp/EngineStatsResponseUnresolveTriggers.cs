// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Text.Json.Serialization;

namespace Senzing
{
    public class EngineStatsResponseUnresolveTriggers
    {
        [JsonPropertyName("extensiveResolve")]
        public int ExtensiveResolve { get; set; }

        [JsonPropertyName("normalResolve")]
        public int NormalResolve { get; set; }
    }
}
