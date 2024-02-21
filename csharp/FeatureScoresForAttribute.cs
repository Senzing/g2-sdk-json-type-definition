// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System;
using System.Collections.Generic;
using System.Text.Json;
using System.Text.Json.Serialization;

namespace Senzing
{
    [JsonConverter(typeof(FeatureScoresForAttributeJsonConverter))]
    public class FeatureScoresForAttribute
    {
        /// <summary>
        /// The underlying data being wrapped.
        /// </summary>
        public IList<FeatureScoreForAttribute> Value { get; set; }
    }

    public class FeatureScoresForAttributeJsonConverter : JsonConverter<FeatureScoresForAttribute>
    {
        public override FeatureScoresForAttribute Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            return new FeatureScoresForAttribute { Value = JsonSerializer.Deserialize<IList<FeatureScoreForAttribute>>(ref reader, options) };
        }

        public override void Write(Utf8JsonWriter writer, FeatureScoresForAttribute value, JsonSerializerOptions options)
        {
            JsonSerializer.Serialize<IList<FeatureScoreForAttribute>>(writer, value.Value, options);
        }
    }
}
