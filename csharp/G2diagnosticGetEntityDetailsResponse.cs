// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System;
using System.Collections.Generic;
using System.Text.Json;
using System.Text.Json.Serialization;

namespace Senzing
{
    [JsonConverter(typeof(G2diagnosticGetEntityDetailsResponseJsonConverter))]
    public class G2diagnosticGetEntityDetailsResponse
    {
        /// <summary>
        /// The underlying data being wrapped.
        /// </summary>
        public IList<G2diagnosticGetEntityDetailsResponse0> Value { get; set; }
    }

    public class G2diagnosticGetEntityDetailsResponseJsonConverter : JsonConverter<G2diagnosticGetEntityDetailsResponse>
    {
        public override G2diagnosticGetEntityDetailsResponse Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            return new G2diagnosticGetEntityDetailsResponse { Value = JsonSerializer.Deserialize<IList<G2diagnosticGetEntityDetailsResponse0>>(ref reader, options) };
        }

        public override void Write(Utf8JsonWriter writer, G2diagnosticGetEntityDetailsResponse value, JsonSerializerOptions options)
        {
            JsonSerializer.Serialize<IList<G2diagnosticGetEntityDetailsResponse0>>(writer, value.Value, options);
        }
    }
}
