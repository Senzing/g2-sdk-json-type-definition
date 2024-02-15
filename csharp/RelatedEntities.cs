// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System;
using System.Collections.Generic;
using System.Text.Json;
using System.Text.Json.Serialization;

namespace Senzing
{
    [JsonConverter(typeof(RelatedEntitiesJsonConverter))]
    public class RelatedEntities
    {
        /// <summary>
        /// The underlying data being wrapped.
        /// </summary>
        public IList<RelatedEntity> Value { get; set; }
    }

    public class RelatedEntitiesJsonConverter : JsonConverter<RelatedEntities>
    {
        public override RelatedEntities Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            return new RelatedEntities { Value = JsonSerializer.Deserialize<IList<RelatedEntity>>(ref reader, options) };
        }

        public override void Write(Utf8JsonWriter writer, RelatedEntities value, JsonSerializerOptions options)
        {
            JsonSerializer.Serialize<IList<RelatedEntity>>(writer, value.Value, options);
        }
    }
}
