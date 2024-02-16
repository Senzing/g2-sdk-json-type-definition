// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System;
using System.Text.Json;
using System.Text.Json.Serialization;

namespace Senzing
{
    [JsonConverter(typeof(G2engineSearchByAttributesResponseXxxJsonConverter))]
    public class G2engineSearchByAttributesResponseXxx
    {
        /// <summary>
        /// The underlying data being wrapped.
        /// </summary>
        public EntitiesByFeatureId Value { get; set; }
    }

    public class G2engineSearchByAttributesResponseXxxJsonConverter : JsonConverter<G2engineSearchByAttributesResponseXxx>
    {
        public override G2engineSearchByAttributesResponseXxx Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            return new G2engineSearchByAttributesResponseXxx { Value = JsonSerializer.Deserialize<EntitiesByFeatureId>(ref reader, options) };
        }

        public override void Write(Utf8JsonWriter writer, G2engineSearchByAttributesResponseXxx value, JsonSerializerOptions options)
        {
            JsonSerializer.Serialize<EntitiesByFeatureId>(writer, value.Value, options);
        }
    }
}
