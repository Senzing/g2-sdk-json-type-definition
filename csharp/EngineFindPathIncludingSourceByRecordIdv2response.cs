// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System;
using System.Text.Json;
using System.Text.Json.Serialization;

namespace Senzing
{
    [JsonConverter(typeof(EngineFindPathIncludingSourceByRecordIdv2responseJsonConverter))]
    public class EngineFindPathIncludingSourceByRecordIdv2response
    {
        /// <summary>
        /// The underlying data being wrapped.
        /// </summary>
        public Path Value { get; set; }
    }

    public class EngineFindPathIncludingSourceByRecordIdv2responseJsonConverter : JsonConverter<EngineFindPathIncludingSourceByRecordIdv2response>
    {
        public override EngineFindPathIncludingSourceByRecordIdv2response Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            return new EngineFindPathIncludingSourceByRecordIdv2response { Value = JsonSerializer.Deserialize<Path>(ref reader, options) };
        }

        public override void Write(Utf8JsonWriter writer, EngineFindPathIncludingSourceByRecordIdv2response value, JsonSerializerOptions options)
        {
            JsonSerializer.Serialize<Path>(writer, value.Value, options);
        }
    }
}
