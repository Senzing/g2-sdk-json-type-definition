// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Text.Json.Serialization;

namespace Senzing
{
    public class WhyEntity
    {
        [JsonPropertyName("ENTITIES")]
        public Entities Entities { get; set; }

        [JsonPropertyName("WHY_RESULTS")]
        public WhyResults WhyResults { get; set; }
    }
}
