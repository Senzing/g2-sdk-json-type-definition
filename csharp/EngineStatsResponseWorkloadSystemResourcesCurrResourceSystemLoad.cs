// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Text.Json.Serialization;

namespace Senzing
{
    public class EngineStatsResponseWorkloadSystemResourcesCurrResourceSystemLoad
    {
        [JsonPropertyName("cpuIdle")]
        public double CpuIdle { get; set; }

        [JsonPropertyName("cpuSoftIrq")]
        public double CpuSoftIrq { get; set; }

        [JsonPropertyName("cpuSystem")]
        public double CpuSystem { get; set; }

        [JsonPropertyName("cpuUser")]
        public double CpuUser { get; set; }

        [JsonPropertyName("cpuWait")]
        public double CpuWait { get; set; }
    }
}
