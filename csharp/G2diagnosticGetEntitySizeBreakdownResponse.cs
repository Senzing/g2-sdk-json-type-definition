// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System;
using System.Text.Json;
using System.Text.Json.Serialization;

namespace Senzing
{
    [JsonConverter(typeof(G2diagnosticGetEntitySizeBreakdownResponseJsonConverter))]
    public class G2diagnosticGetEntitySizeBreakdownResponse
    {
        /// <summary>
        /// The underlying data being wrapped.
        /// </summary>
        public AttributeCounters Value { get; set; }
    }

    public class G2diagnosticGetEntitySizeBreakdownResponseJsonConverter : JsonConverter<G2diagnosticGetEntitySizeBreakdownResponse>
    {
        public override G2diagnosticGetEntitySizeBreakdownResponse Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            return new G2diagnosticGetEntitySizeBreakdownResponse { Value = JsonSerializer.Deserialize<AttributeCounters>(ref reader, options) };
        }

        public override void Write(Utf8JsonWriter writer, G2diagnosticGetEntitySizeBreakdownResponse value, JsonSerializerOptions options)
        {
            JsonSerializer.Serialize<AttributeCounters>(writer, value.Value, options);
        }
    }
}
