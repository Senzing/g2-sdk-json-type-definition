// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Senzing
{
    public class InterestingEntities
    {
        [JsonPropertyName("ENTITIES")]
        public IList<InterestingEntity> Entities { get; set; }

        [JsonPropertyName("NOTICES")]
        public Notices Notices { get; set; }
    }
}
